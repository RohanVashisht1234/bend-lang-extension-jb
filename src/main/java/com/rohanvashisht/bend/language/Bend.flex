package com.rohanvashisht.bend.language;
import com.intellij.psi.tree.IElementType;
import static com.rohanvashisht.bend.language.psi.BendTypes.*;
import com.intellij.lexer.FlexLexer;

%%

%{
  public _BendLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _BendLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

%{
    private int commentStart;
    private int commentDepth;

    private int optionsGhcStart;
    private int optionsGhcDepth;

    private int haddockStart;
    private int haddockDepth;

    private int qqStart;
    private int qqDepth;
%}

%xstate NCOMMENT, NHADDOCK, QQ, OPTIONS_GHC

newline             = \r|\n|\r\n
unispace            = \x05
white_char          = [\ \t\f\x0B\ \x0D ] | {unispace}    // second "space" is probably ^M, I could not find another solution than just pasting it in to prevent a bad character.
directive           = "#" {white_char}* ("def" | "case" | "return" | "if" | "else" | "elif" | "import" | "from" | "class" | "try" | "except" | "finally" | "with" | "as" | "while" | "for" | "in" | "break" | "continue" | "pass" | "assert" | "del" | "global" | "nonlocal" | "raise" | "yield" | "lambda" | "return" | "match") ("\\" (\r|\n|\r\n) | [^\r\n])*
include_directive   = "#" {white_char}* "include" {white_char}*\"({small}|{large}|{digit}|{dot})+\"
white_space         = {white_char}+

underscore          = "_"
small               = [a-z] | {underscore}
large               = [A-Z]

digit               = [0-9]
decimal             = [-+]?({underscore}*{digit}+)+

hexit               = [0-9A-Fa-f]
hexadecimal         = 0[xX]({underscore}*{hexit}+)+

octit               = [0-7]
octal               = 0[oO]({underscore}*{octit}+)+

float               = [-+]?(({underscore}*[0-9]+)+(\.({underscore}*[0-9]+)+)?|\ \.({underscore}*[0-9]+)+)([eE][-+]?[0-9]+)?

gap                 = \\({white_char}|{newline})*
cntrl               = {large} | [@\[\\\]\^_]
charesc             = [abfnrtv\\\"\'&]
ascii               = ("^"{cntrl})|(NUL)|(SOH)|(STX)|(ETX)|(EOT)|(ENQ)|(ACK)|(BEL)|(BS)|(HT)|(LF)|(VT)|(FF)|(CR)|(SO)|(SI)|(DLE)|(DC1)|(DC2)|(DC3)|(DC4)|(NAK)|(SYN)|(ETB)|(CAN)|(EM)|(SUB)|(ESC)|(FS)|(GS)|(RS)|(US)|(SP)|(DEL)
escape              = \\({charesc}|{ascii}|({digit}+)|(o({octit}+))|(x({hexit}+)))

character_literal   = (\'([^\'\\\n]|{escape})\')
string_literal      = \"([^\"\\\n]|{escape}|{gap})*(\"|\n)

exclamation_mark    = "!"
hash                = "#"
dollar              = "$"
percentage          = "%"
ampersand           = "&"
star                = "*"
plus                = "+"
dot                 = "."
slash               = "/"
lt                  = "<"
gt                  = ">"
question_mark       = "?"
caret               = "^"
dash                = "-"

equal               = "="
at                  = "@"
backslash           = "\\"
vertical_bar        = "|"
tilde               = "~"
colon               = ":"

colon_colon         = "::"
left_arrow          = "<-"
right_arrow         = "->"
double_right_arrow  = "=>"

left_paren          = "("
right_paren         = ")"
comma               = ","
semicolon           = ";"
left_bracket        = "["
right_bracket       = "]"
backquote           = "`"
left_brace          = "{"
right_brace         = "}"

quote               = "'"
double_quotes       = "\""

forall              = "forall"

symbol_no_dot       = {equal} | {at} | {backslash} | {vertical_bar} | {tilde} | {exclamation_mark} | {hash} | {dollar} | {percentage} | {ampersand} | {star} | {plus} | {slash} | {lt} | {gt} | {question_mark} | {caret} | {dash}

symbol              = {symbol_no_dot} | {dot}

base_var_id         = {small} ({small} | {large} | {digit} | {quote})*
var_id              = {question_mark}? {base_var_id} | {hash} {base_var_id} | {base_var_id} {hash}
varsym_id           = (({symbol_no_dot} | {left_arrow} | {right_arrow} | {double_right_arrow}) ({symbol} | {colon})+) | {symbol_no_dot} ({symbol} | {colon})*

con_id              = {large} ({small} | {large} | {digit} | {quote})*
consym_id           = {quote}? {colon} ({symbol} | {colon})*

pragma_start        = {left_brace}{dash}{hash}
pragma_end          = {hash}{dash}{right_brace}

comment             = \#[^\r\n]*
ncomment_start      = {left_brace}{dash}
ncomment_end        = {dash}{right_brace}
haddock             = {hash}{white_char}[\^\|][^\r\n]* ({newline}+{white_char}*{comment})*
nhaddock_start      = {hash}{white_char}?{vertical_bar}

%%

<NHADDOCK> {
    {ncomment_start} {
        haddockDepth++;
    }

    <<EOF>> {
        yybegin(YYINITIAL);
        zzStartRead = haddockStart;
        return BEND_NOT_TERMINATED_COMMENT;
    }

    {ncomment_end} {
        if (haddockDepth > 0) {
            haddockDepth--;
        } else {
             yybegin(YYINITIAL);
             zzStartRead = haddockStart;
             return BEND_NHADDOCK;
        }
    }

    .|{white_char}|{newline} {}
}

{nhaddock_start} {
    yybegin(NHADDOCK);
    haddockDepth = 0;
    haddockStart = getTokenStart();
}

<NCOMMENT> {
    {ncomment_start} {
        commentDepth++;
    }

    <<EOF>> {
        yybegin(YYINITIAL);
        zzStartRead = commentStart;
        return BEND_NOT_TERMINATED_COMMENT;
    }

    {ncomment_end} {
        if (commentDepth > 0) {
            commentDepth--;
        } else {
             yybegin(YYINITIAL);
             zzStartRead = commentStart;
             return BEND_NCOMMENT;
        }
    }

    .|{white_char}|{newline} {}
}

{ncomment_start} {
    yybegin(NCOMMENT);
    commentDepth = 0;
    commentStart = getTokenStart();
}

<OPTIONS_GHC> {
    <<EOF>> {
        yybegin(YYINITIAL);
        return com.intellij.psi.TokenType.BAD_CHARACTER;
    }

    {pragma_end} {
        yybegin(YYINITIAL);
        return BEND_PRAGMA_END;
    }

    "," {
        return BEND_PRAGMA_SEP;
    }

    {character_literal}   { return BEND_CHARACTER_LITERAL; }
    {string_literal}      { return BEND_STRING_LITERAL; }
    {newline}             { return BEND_NEWLINE; }
    {dash}                { return BEND_DASH; }
    {hash}                { return BEND_HASH; }
    {white_space}         { return com.intellij.psi.TokenType.WHITE_SPACE; }

    ([a-zA-Z0-9_=\(\):<>*/\|\'\!\?\.+\^&%$@\[\];,~\\`\"\{\}]|[\u2200-\u22FF]|[\u2190-\u21FF]|[\u0370-\u03FF])+ {
        return BEND_ONE_PRAGMA;
    }
}

{pragma_start} {
    yybegin(OPTIONS_GHC);
    return BEND_PRAGMA_START;
}

<QQ> {
    {left_bracket} ({var_id}|{con_id}|{dot}|{white_char}|{varsym_id})* {vertical_bar} {
        qqDepth++;
    }

    <<EOF>> {
        yybegin(YYINITIAL);
        zzStartRead = qqStart;
        return BEND_NOT_TERMINATED_QQ_EXPRESSION;
    }

    {vertical_bar} {right_bracket} {
        if (qqDepth > 0) {
            qqDepth--;
        } else {
             yybegin(YYINITIAL);
             zzStartRead = qqStart;
             return BEND_QUASIQUOTE;
        }
    }

    {right_bracket} {
        if (qqDepth > 0) {
            qqDepth--;
        } else {
             yybegin(YYINITIAL);
             zzStartRead = qqStart;
             return BEND_LIST_COMPREHENSION;
        }
    }

    {left_bracket} {
        qqDepth++;
    }

    .|{white_char}|{newline} {}
}

{left_bracket} ({var_id}|{con_id}|{dot}|{white_char}|{varsym_id})* {vertical_bar} {
    yybegin(QQ);
    qqDepth = 0;
    qqStart = getTokenStart();
}

{newline}             { return BEND_NEWLINE; }

{haddock}             { return BEND_HADDOCK; }

{comment}             { return BEND_COMMENT; }
{white_space}         { return com.intellij.psi.TokenType.WHITE_SPACE; }

{include_directive}   { return BEND_INCLUDE_DIRECTIVE; }
{directive}           { return BEND_DIRECTIVE; }

// not listed as reserved identifier but have meaning in certain contexts,
// let's say special reserved id
"def"                 { return BEND_DEF; }
"class"               { return BEND_CLASS; }
"return"              { return BEND_RETURN; }
"if"                  { return BEND_IF; }
"else"                { return BEND_ELSE; }
"try"                 { return BEND_TRY; }
"except"              { return BEND_EXCEPT; }
"finally"             { return BEND_FINALLY; }
"from"                { return BEND_FROM; }
"import"              { return BEND_IMPORT; }
"pass"                { return BEND_PASS; }
"break"               { return BEND_BREAK; }
"continue"            { return BEND_CONTINUE; }
"raise"               { return BEND_RAISE; }
"yield"               { return BEND_YIELD; }
"lambda"              { return BEND_LAMBDA; }
"global"              { return BEND_GLOBAL; }
"nonlocal"            { return BEND_NONLOCAL; }
"assert"              { return BEND_ASSERT; }
"del"                 { return BEND_DEL; }
"return"                 { return BEND_RETURN; }
"match"                { return BEND_MATCH; }
"case"     {return BEND_CASE;}
// identifiers
{var_id}              { return BEND_VAR_ID; }
{con_id}              { return BEND_CON_ID; }

{character_literal}   { return BEND_CHARACTER_LITERAL; }
{string_literal}      { return BEND_STRING_LITERAL; }

// reservedop and no symbol, except dot_dot because that one is handled as symbol
{colon_colon}         { return BEND_COLON_COLON; }
{left_arrow}          { return BEND_LEFT_ARROW; }
{right_arrow}         { return BEND_RIGHT_ARROW; }
{double_right_arrow}  { return BEND_DOUBLE_RIGHT_ARROW; }

// number
{decimal}             { return BEND_DECIMAL; }
{hexadecimal}         { return BEND_HEXADECIMAL; }
{octal}               { return BEND_OCTAL; }
{float}               { return BEND_FLOAT; }

// symbol and reservedop
{equal}               { return BEND_EQUAL; }
{at}                  { return BEND_AT; }
{backslash}           { return BEND_BACKSLASH; }
{vertical_bar}        { return BEND_VERTICAL_BAR; }
{tilde}               { return BEND_TILDE; }

// symbol identifiers
{varsym_id}           { return BEND_VARSYM_ID; }
{consym_id}           { return BEND_CONSYM_ID; }

{dot}                 { return BEND_DOT; }

// special
{left_paren}          { return BEND_LEFT_PAREN; }
{right_paren}         { return BEND_RIGHT_PAREN; }
{comma}               { return BEND_COMMA; }
{semicolon}           { return BEND_SEMICOLON; }
{left_bracket}        { return BEND_LEFT_BRACKET; }
{right_bracket}       { return BEND_RIGHT_BRACKET; }
{backquote}           { return BEND_BACKQUOTE; }
{left_brace}          { return BEND_LEFT_BRACE; }
{right_brace}         { return BEND_RIGHT_BRACE; }

{quote}               { return BEND_QUOTE; }

{forall}              { return BEND_FORALL; }

{double_quotes}       { return BEND_DOUBLE_QUOTES; }

[^]                   { return com.intellij.psi.TokenType.BAD_CHARACTER; }

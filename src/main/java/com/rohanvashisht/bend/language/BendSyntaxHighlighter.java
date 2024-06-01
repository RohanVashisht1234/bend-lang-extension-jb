package com.rohanvashisht.bend.language;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.rohanvashisht.bend.language.psi.BendTypes;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;
import static com.rohanvashisht.bend.language.BendParserDefinition.*;

public class BendSyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey ILLEGAL = createTextAttributesKey("BEND_ILLEGAL", DefaultLanguageHighlighterColors.INVALID_STRING_ESCAPE);
    public static final TextAttributesKey COMMENT = createTextAttributesKey("BEND_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BLOCKCOMMENT = createTextAttributesKey("BEND_NCOMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT);
    public static final TextAttributesKey DOCCOMMENT = createTextAttributesKey("BEND_HADDOCK", DefaultLanguageHighlighterColors.DOC_COMMENT);
    public static final TextAttributesKey BLOCKDOCCOMMENT = createTextAttributesKey("BEND_NHADDOCK", DefaultLanguageHighlighterColors.DOC_COMMENT);
    public static final TextAttributesKey STRING = createTextAttributesKey("BEND_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey NUMBER = createTextAttributesKey("BEND_NUMBER", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey KEYWORD = createTextAttributesKey("BEND_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey FUNCTIONNAME = createTextAttributesKey("BEND_FUNCTION_NAME", DefaultLanguageHighlighterColors.FUNCTION_DECLARATION);
    public static final TextAttributesKey PARENTHESES = createTextAttributesKey("BEND_PARENTHESES", DefaultLanguageHighlighterColors.PARENTHESES);
    public static final TextAttributesKey BRACE = createTextAttributesKey("BEND_BRACE", DefaultLanguageHighlighterColors.BRACES);
    public static final TextAttributesKey BRACKET = createTextAttributesKey("BEND_BRACKET", DefaultLanguageHighlighterColors.BRACKETS);
    public static final TextAttributesKey VARIABLE = createTextAttributesKey("BEND_VARIABLE", DefaultLanguageHighlighterColors.LOCAL_VARIABLE);
    public static final TextAttributesKey PRAGMACONTENT = createTextAttributesKey("BEND_PRAGMA_CONTENT", DefaultLanguageHighlighterColors.IDENTIFIER);
    public static final TextAttributesKey CONSTRUCTOR = createTextAttributesKey("BEND_CONSTRUCTOR", DefaultLanguageHighlighterColors.INSTANCE_FIELD);
    public static final TextAttributesKey OPERATOR = createTextAttributesKey("BEND_OPERATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey RESERVEDSYMBOL = createTextAttributesKey("BEND_SYMBOL", DefaultLanguageHighlighterColors.PREDEFINED_SYMBOL);
    public static final TextAttributesKey PRAGMA = createTextAttributesKey("BEND_PRAGMA", DefaultLanguageHighlighterColors.METADATA);
    public static final TextAttributesKey QUASIQUOTE = createTextAttributesKey("BEND_QUASI_QUOTES", DefaultLanguageHighlighterColors.METADATA);
    public static final TextAttributesKey DEFAULT = createTextAttributesKey("BEND_DEFAULT", DefaultLanguageHighlighterColors.LOCAL_VARIABLE);

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new BendLexerAdapter();
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return pack(ILLEGAL);
        }

        if (PRAGMASTARTENDIDS.contains(tokenType)) {
            return pack(PRAGMA);
        }

        if (tokenType.equals(BendTypes.BEND_COMMENT)) {
            return pack(COMMENT);
        }

        if (tokenType.equals(BendTypes.BEND_HADDOCK) || tokenType.equals(BendTypes.BEND_NHADDOCK)) {
            return pack(DOCCOMMENT);
        }

        if (tokenType.equals(BendTypes.BEND_NCOMMENT)) {
            return pack(BLOCKCOMMENT);
        }

        if (tokenType.equals(BendTypes.BEND_STRING_LITERAL) || tokenType.equals(BendTypes.BEND_CHARACTER_LITERAL)) {
            return pack(STRING);
        }

        if (NUMBERLITERALS.contains(tokenType)) {
            return pack(NUMBER);
        }

        if (tokenType.equals(BendTypes.BEND_LEFT_PAREN) || tokenType.equals(BendTypes.BEND_RIGHT_PAREN)) {
            return pack(PARENTHESES);
        }

        if (tokenType.equals(BendTypes.BEND_LEFT_BRACE) || tokenType.equals(BendTypes.BEND_RIGHT_BRACE)) {
            return pack(BRACE);
        }

        if (tokenType.equals(BendTypes.BEND_LEFT_BRACKET) || tokenType.equals(BendTypes.BEND_RIGHT_BRACKET)) {
            return pack(BRACKET);
        }

        if (ALLRESERVEDIDS.contains(tokenType)) {
            return pack(KEYWORD);
        }

        if (SYMBOLSRESOP.contains(tokenType)) {
            return pack(RESERVEDSYMBOL);
        }

        if (OPERATORS.contains(tokenType)) {
            return pack(OPERATOR);
        }

        if (tokenType.equals(BendTypes.BEND_VAR_ID)) {
            return pack(VARIABLE);
        }

        if (tokenType.equals(BendTypes.BEND_CON_ID)) {
            return pack(CONSTRUCTOR);
        }

        if (tokenType.equals(BendTypes.BEND_MODID)) {
            return pack(CONSTRUCTOR);
        }

        if (tokenType.equals(BendTypes.BEND_QUASIQUOTE)) {
            return pack(QUASIQUOTE);
        }

        if (WHITE_SPACES.contains(tokenType) || tokenType == BendTypes.BEND_NEWLINE) {
            return pack(null);
        }

        return pack(DEFAULT);
    }

}
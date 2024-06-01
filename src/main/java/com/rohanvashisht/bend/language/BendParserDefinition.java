package com.rohanvashisht.bend.language;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import com.rohanvashisht.bend.language.parser.BendParser;
import com.rohanvashisht.bend.language.psi.BendFile;
import com.rohanvashisht.bend.language.psi.BendTypes;
import org.jetbrains.annotations.NotNull;

public class BendParserDefinition implements ParserDefinition {

    public static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);
    public static final TokenSet COMMENTS = TokenSet.create(
        BendTypes.BEND_COMMENT, BendTypes.BEND_NCOMMENT, BendTypes.BEND_HADDOCK, BendTypes.BEND_NHADDOCK
    );
    public static final TokenSet PRAGMASTARTENDIDS = TokenSet.create(
            BendTypes.BEND_PRAGMA_START, BendTypes.BEND_PRAGMA_END
    );
    public static final TokenSet RESERVEDIDS = TokenSet.create(
            BendTypes.BEND_CASE, BendTypes.BEND_CLASS, BendTypes.BEND_DATA,
            BendTypes.BEND_MATCH,
            BendTypes.BEND_DEFAULT, BendTypes.BEND_DERIVING, BendTypes.BEND_DO,
            BendTypes.BEND_ELSE, BendTypes.BEND_IF, BendTypes.BEND_IMPORT,
            BendTypes.BEND_IN, BendTypes.BEND_INFIX, BendTypes.BEND_INFIXL,
            BendTypes.BEND_INFIXR, BendTypes.BEND_INSTANCE, BendTypes.BEND_LET,
            BendTypes.BEND_MODULE, BendTypes.BEND_NEWTYPE, BendTypes.BEND_OF,
            BendTypes.BEND_RETURN,
            BendTypes.BEND_THEN, BendTypes.BEND_TYPE, BendTypes.BEND_WHERE, BendTypes.BEND_UNDERSCORE, BendTypes.BEND_DEF
    );
    public static final TokenSet SPECIALRESERVEDIDS = TokenSet.create(
            BendTypes.BEND_TYPE_FAMILY, BendTypes.BEND_FOREIGN_IMPORT, BendTypes.BEND_FOREIGN_EXPORT,
            BendTypes.BEND_TYPE_INSTANCE
    );
    public static final TokenSet ALLRESERVEDIDS = TokenSet.orSet(RESERVEDIDS, SPECIALRESERVEDIDS);
    public static final TokenSet RESERVEDOPERATORS = TokenSet.create(
            BendTypes.BEND_COLON_COLON, BendTypes.BEND_EQUAL, BendTypes.BEND_BACKSLASH,
            BendTypes.BEND_VERTICAL_BAR, BendTypes.BEND_LEFT_ARROW,
            BendTypes.BEND_RIGHT_ARROW, BendTypes.BEND_AT, BendTypes.BEND_TILDE,
            BendTypes.BEND_DOUBLE_RIGHT_ARROW, BendTypes.BEND_DOT_DOT
    );
    public static final TokenSet OPERATORS = TokenSet.orSet(
        RESERVEDOPERATORS,
        TokenSet.create(
                BendTypes.BEND_VARSYM_ID,
                BendTypes.BEND_CONSYM_ID
        ),
        TokenSet.create(BendTypes.BEND_DOT)
    );
    public static final TokenSet NUMBERLITERALS = TokenSet.create(
            BendTypes.BEND_DECIMAL,
            BendTypes.BEND_FLOAT,
            BendTypes.BEND_HEXADECIMAL,
            BendTypes.BEND_CASE,
            BendTypes.BEND_OCTAL
    );
    public static final TokenSet SYMBOLSRESOP = TokenSet.create(
            BendTypes.BEND_EQUAL,
            BendTypes.BEND_AT,
            BendTypes.BEND_BACKSLASH,
            BendTypes.BEND_VERTICAL_BAR,
            BendTypes.BEND_TILDE
    );
    public static final TokenSet STRINGLITERALS = TokenSet.create(
            BendTypes.BEND_CHARACTER_LITERAL,
            BendTypes.BEND_STRING_LITERAL
    );
    public static final TokenSet LITERALS = TokenSet.orSet(
        STRINGLITERALS,
        NUMBERLITERALS,
        TokenSet.create(BendTypes.BEND_QUASIQUOTE)
    );
    public static final TokenSet IDS = TokenSet.create(
            BendTypes.BEND_VAR_ID,
            BendTypes.BEND_CON_ID,
            BendTypes.BEND_VARSYM_ID,
            BendTypes.BEND_CONSYM_ID
    );

    public static final IFileElementType FILE = new IFileElementType(BendLanguage.INSTANCE);

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new BendLexerAdapter();
    }

    @NotNull
    @Override
    public TokenSet getWhitespaceTokens() {
        return WHITE_SPACES;
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return COMMENTS;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull
    @Override
    public PsiParser createParser(final Project project) {
        return new BendParser();
    }

    @Override
    public @NotNull IFileElementType getFileNodeType() {
        return FILE;
    }

    @Override
    public @NotNull PsiFile createFile(@NotNull FileViewProvider viewProvider) {
        return new BendFile(viewProvider);
    }

    @Override
    public @NotNull SpaceRequirements spaceExistenceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MAY;
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        return BendTypes.Factory.createElement(node);
    }

}

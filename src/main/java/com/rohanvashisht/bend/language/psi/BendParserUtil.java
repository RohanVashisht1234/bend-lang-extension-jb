package com.rohanvashisht.bend.language.psi;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.parser.GeneratedParserUtilBase;
import com.intellij.psi.TokenType;
import com.rohanvashisht.bend.language.psi.BendTypes;

public class BendParserUtil extends GeneratedParserUtilBase {

    public static boolean containsSpaces(PsiBuilder builder, int level) {
        return (builder.rawLookup(0) == BendTypes.BEND_NEWLINE && (builder.rawLookup(1) == TokenType.WHITE_SPACE || builder.rawLookup(1) == BendTypes.BEND_COMMENT) || builder.rawLookup(1) == BendTypes.BEND_NCOMMENT || builder.rawLookup(1) == BendTypes.BEND_DIRECTIVE || builder.rawLookup(1) == BendTypes.BEND_HADDOCK || builder.rawLookup(1) == BendTypes.BEND_NHADDOCK) ||
            (builder.rawLookup(0) == BendTypes.BEND_NEWLINE && builder.rawLookup(1) == BendTypes.BEND_NEWLINE && builder.rawLookup(2) == TokenType.WHITE_SPACE) ||
            (builder.rawLookup(0) == BendTypes.BEND_NEWLINE && builder.rawLookup(1) == BendTypes.BEND_NEWLINE && builder.rawLookup(2) == BendTypes.BEND_NEWLINE && builder.rawLookup(3) == TokenType.WHITE_SPACE) ||
            (builder.rawLookup(0) == BendTypes.BEND_NEWLINE && builder.rawLookup(1) == BendTypes.BEND_NEWLINE && builder.rawLookup(2) == BendTypes.BEND_NEWLINE && builder.rawLookup(3) == BendTypes.BEND_NEWLINE && builder.rawLookup(4) == TokenType.WHITE_SPACE) ||
            (builder.rawLookup(0) == BendTypes.BEND_NEWLINE && builder.rawLookup(1) == BendTypes.BEND_NEWLINE && builder.rawLookup(2) == BendTypes.BEND_NEWLINE && builder.rawLookup(3) == BendTypes.BEND_NEWLINE && builder.rawLookup(4) == BendTypes.BEND_NEWLINE && builder.rawLookup(5) == TokenType.WHITE_SPACE) ||
            (builder.rawLookup(0) == BendTypes.BEND_NEWLINE && builder.rawLookup(1) == BendTypes.BEND_NEWLINE && builder.rawLookup(2) == BendTypes.BEND_NEWLINE && builder.rawLookup(3) == BendTypes.BEND_NEWLINE && builder.rawLookup(4) == BendTypes.BEND_NEWLINE && builder.rawLookup(5) == BendTypes.BEND_NEWLINE && builder.rawLookup(6) == TokenType.WHITE_SPACE) ||
            (builder.rawLookup(0) == BendTypes.BEND_NEWLINE && builder.rawLookup(1) == BendTypes.BEND_NEWLINE && builder.rawLookup(2) == BendTypes.BEND_NEWLINE && builder.rawLookup(3) == BendTypes.BEND_NEWLINE && builder.rawLookup(4) == BendTypes.BEND_NEWLINE && builder.rawLookup(5) == BendTypes.BEND_NEWLINE && builder.rawLookup(6) == BendTypes.BEND_NEWLINE && builder.rawLookup(7) == TokenType.WHITE_SPACE);
    }

    public static boolean noSpaceAfterQualifier(PsiBuilder builder, int level) {
        return (builder.rawLookup(0) == BendTypes.BEND_CON_ID && builder.rawLookup(1) == BendTypes.BEND_DOT);
    }

}
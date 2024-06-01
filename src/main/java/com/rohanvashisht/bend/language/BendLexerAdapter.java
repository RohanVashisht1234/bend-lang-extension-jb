package com.rohanvashisht.bend.language;

import com.intellij.lexer.FlexAdapter;

public class BendLexerAdapter extends FlexAdapter {

    public BendLexerAdapter() {
        super(new _BendLexer(null));
    }

}
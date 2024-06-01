package com.rohanvashisht.bend.language;

import com.intellij.lang.Language;

public class BendLanguage extends Language {

    public static final BendLanguage INSTANCE = new BendLanguage();

    private BendLanguage() {
        super("BendLanguage");
    }

}

package com.rohanvashisht.bend.language;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class BendFileType extends LanguageFileType {

    public static final BendFileType INSTANCE = new BendFileType();

    private BendFileType() {
        super(BendLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Bend";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Bend language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "bend";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return BendIcon.FILE;
    }

}

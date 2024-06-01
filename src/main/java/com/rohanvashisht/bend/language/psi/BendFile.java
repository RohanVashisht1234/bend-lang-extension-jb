package com.rohanvashisht.bend.language.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.rohanvashisht.bend.language.BendFileType;
import com.rohanvashisht.bend.language.BendLanguage;
import org.jetbrains.annotations.NotNull;

public class BendFile extends PsiFileBase {

    public BendFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, BendLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return BendFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Bend File";
    }

}
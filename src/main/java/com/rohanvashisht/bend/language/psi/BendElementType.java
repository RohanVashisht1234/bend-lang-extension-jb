package com.rohanvashisht.bend.language.psi;

import com.intellij.psi.tree.IElementType;
import com.rohanvashisht.bend.language.BendLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class BendElementType extends IElementType {

    public BendElementType(@NotNull @NonNls String debugName) {
        super(debugName, BendLanguage.INSTANCE);
    }

}
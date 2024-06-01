package com.rohanvashisht.bend.language.psi;

import com.intellij.psi.tree.IElementType;
import com.rohanvashisht.bend.language.BendLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class BendTokenType extends IElementType {

    public BendTokenType(@NotNull @NonNls String debugName) {
        super(debugName, BendLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "BendTokenType." + super.toString();
    }

}
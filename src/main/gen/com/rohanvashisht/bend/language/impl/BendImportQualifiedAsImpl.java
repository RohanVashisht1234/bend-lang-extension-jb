// This is a generated file. Not intended for manual editing.
package com.rohanvashisht.bend.language.impl;

import com.rohanvashisht.bend.language.psi.BendImportQualifiedAs;
import com.rohanvashisht.bend.language.psi.BendQualifier;
import com.rohanvashisht.bend.language.psi.BendVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.rohanvashisht.bend.language.psi.*;

public class BendImportQualifiedAsImpl extends ASTWrapperPsiElement implements BendImportQualifiedAs {

  public BendImportQualifiedAsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BendVisitor visitor) {
    visitor.visitImportQualifiedAs(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BendVisitor) accept((BendVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public BendQualifier getQualifier() {
    return findNotNullChildByClass(BendQualifier.class);
  }

}

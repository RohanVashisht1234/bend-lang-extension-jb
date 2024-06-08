// This is a generated file. Not intended for manual editing.
package com.rohanvashisht.bend.language.impl;

import com.rohanvashisht.bend.language.psi.BendImportPackageName;
import com.rohanvashisht.bend.language.psi.BendTextLiteral;
import com.rohanvashisht.bend.language.psi.BendVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;

public class BendImportPackageNameImpl extends ASTWrapperPsiElement implements BendImportPackageName {

  public BendImportPackageNameImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BendVisitor visitor) {
    visitor.visitImportPackageName(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BendVisitor) accept((BendVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public BendTextLiteral getTextLiteral() {
    return findNotNullChildByClass(BendTextLiteral.class);
  }

}

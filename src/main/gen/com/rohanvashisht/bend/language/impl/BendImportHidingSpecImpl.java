// This is a generated file. Not intended for manual editing.
package com.rohanvashisht.bend.language.impl;

import java.util.List;

import com.rohanvashisht.bend.language.psi.*;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.rohanvashisht.bend.language.psi.*;

public class BendImportHidingSpecImpl extends ASTWrapperPsiElement implements BendImportHidingSpec {

  public BendImportHidingSpecImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BendVisitor visitor) {
    visitor.visitImportHidingSpec(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BendVisitor) accept((BendVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public BendImportHiding getImportHiding() {
    return findNotNullChildByClass(BendImportHiding.class);
  }

  @Override
  @NotNull
  public List<BendImportId> getImportIdList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, BendImportId.class);
  }

  @Override
  @NotNull
  public List<BendPragma> getPragmaList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, BendPragma.class);
  }

}

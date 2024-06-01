// This is a generated file. Not intended for manual editing.
package com.rohanvashisht.bend.language.impl;

import com.rohanvashisht.bend.language.psi.*;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.rohanvashisht.bend.language.psi.*;

public class BendImportSpecImpl extends ASTWrapperPsiElement implements BendImportSpec {

  public BendImportSpecImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BendVisitor visitor) {
    visitor.visitImportSpec(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BendVisitor) accept((BendVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public BendImportEmptySpec getImportEmptySpec() {
    return findChildByClass(BendImportEmptySpec.class);
  }

  @Override
  @Nullable
  public BendImportHidingSpec getImportHidingSpec() {
    return findChildByClass(BendImportHidingSpec.class);
  }

  @Override
  @Nullable
  public BendImportIdsSpec getImportIdsSpec() {
    return findChildByClass(BendImportIdsSpec.class);
  }

}

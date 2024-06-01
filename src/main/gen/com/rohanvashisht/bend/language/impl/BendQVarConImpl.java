// This is a generated file. Not intended for manual editing.
package com.rohanvashisht.bend.language.impl;

import com.rohanvashisht.bend.language.psi.*;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.rohanvashisht.bend.language.psi.*;

public class BendQVarConImpl extends ASTWrapperPsiElement implements BendQVarCon {

  public BendQVarConImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BendVisitor visitor) {
    visitor.visitQVarCon(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BendVisitor) accept((BendVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public BendConsym getConsym() {
    return findChildByClass(BendConsym.class);
  }

  @Override
  @Nullable
  public BendQCon getQCon() {
    return findChildByClass(BendQCon.class);
  }

  @Override
  @Nullable
  public BendQualifier getQualifier() {
    return findChildByClass(BendQualifier.class);
  }

  @Override
  @Nullable
  public BendVarid getVarid() {
    return findChildByClass(BendVarid.class);
  }

  @Override
  @Nullable
  public BendVarsym getVarsym() {
    return findChildByClass(BendVarsym.class);
  }

}

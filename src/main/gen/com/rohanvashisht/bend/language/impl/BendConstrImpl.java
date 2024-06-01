// This is a generated file. Not intended for manual editing.
package com.rohanvashisht.bend.language.impl;

import com.rohanvashisht.bend.language.psi.*;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.rohanvashisht.bend.language.psi.*;

public class BendConstrImpl extends ASTWrapperPsiElement implements BendConstr {

  public BendConstrImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BendVisitor visitor) {
    visitor.visitConstr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BendVisitor) accept((BendVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public BendConstr1 getConstr1() {
    return findChildByClass(BendConstr1.class);
  }

  @Override
  @Nullable
  public BendConstr2 getConstr2() {
    return findChildByClass(BendConstr2.class);
  }

  @Override
  @Nullable
  public BendConstr3 getConstr3() {
    return findChildByClass(BendConstr3.class);
  }

}

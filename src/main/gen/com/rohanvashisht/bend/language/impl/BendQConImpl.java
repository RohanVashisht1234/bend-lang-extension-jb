// This is a generated file. Not intended for manual editing.
package com.rohanvashisht.bend.language.impl;

import com.rohanvashisht.bend.language.psi.*;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;

public class BendQConImpl extends ASTWrapperPsiElement implements BendQCon {

  public BendQConImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BendVisitor visitor) {
    visitor.visitQCon(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BendVisitor) accept((BendVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public BendConid getConid() {
    return findNotNullChildByClass(BendConid.class);
  }

  @Override
  @Nullable
  public BendQConQualifier1 getQConQualifier1() {
    return findChildByClass(BendQConQualifier1.class);
  }

  @Override
  @Nullable
  public BendQConQualifier2 getQConQualifier2() {
    return findChildByClass(BendQConQualifier2.class);
  }

  @Override
  @Nullable
  public BendQConQualifier3 getQConQualifier3() {
    return findChildByClass(BendQConQualifier3.class);
  }

  @Override
  @Nullable
  public BendQConQualifier4 getQConQualifier4() {
    return findChildByClass(BendQConQualifier4.class);
  }

}

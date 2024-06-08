// This is a generated file. Not intended for manual editing.
package com.rohanvashisht.bend.language.impl;

import com.rohanvashisht.bend.language.psi.BendQName;
import com.rohanvashisht.bend.language.psi.BendQVarCon;
import com.rohanvashisht.bend.language.psi.BendVarCon;
import com.rohanvashisht.bend.language.psi.BendVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;


public class BendQNameImpl extends ASTWrapperPsiElement implements BendQName {

  public BendQNameImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BendVisitor visitor) {
    visitor.visitQName(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BendVisitor) accept((BendVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public BendQVarCon getQVarCon() {
    return findChildByClass(BendQVarCon.class);
  }

  @Override
  @Nullable
  public BendVarCon getVarCon() {
    return findChildByClass(BendVarCon.class);
  }

}

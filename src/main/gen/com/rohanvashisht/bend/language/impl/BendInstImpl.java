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

public class BendInstImpl extends ASTWrapperPsiElement implements BendInst {

  public BendInstImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BendVisitor visitor) {
    visitor.visitInst(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BendVisitor) accept((BendVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<BendGtycon> getGtyconList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, BendGtycon.class);
  }

  @Override
  @NotNull
  public List<BendInstvar> getInstvarList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, BendInstvar.class);
  }

  @Override
  @NotNull
  public List<BendPragma> getPragmaList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, BendPragma.class);
  }

}

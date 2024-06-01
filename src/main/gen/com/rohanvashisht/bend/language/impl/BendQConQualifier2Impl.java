// This is a generated file. Not intended for manual editing.
package com.rohanvashisht.bend.language.impl;

import java.util.List;

import com.rohanvashisht.bend.language.psi.BendConid;
import com.rohanvashisht.bend.language.psi.BendQConQualifier2;
import com.rohanvashisht.bend.language.psi.BendVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.rohanvashisht.bend.language.psi.*;

public class BendQConQualifier2Impl extends ASTWrapperPsiElement implements BendQConQualifier2 {

  public BendQConQualifier2Impl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BendVisitor visitor) {
    visitor.visitQConQualifier2(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BendVisitor) accept((BendVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<BendConid> getConidList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, BendConid.class);
  }

}

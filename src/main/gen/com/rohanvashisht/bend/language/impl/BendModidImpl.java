// This is a generated file. Not intended for manual editing.
package com.rohanvashisht.bend.language.impl;

import java.util.List;

import com.rohanvashisht.bend.language.psi.BendConid;
import com.rohanvashisht.bend.language.psi.BendModid;
import com.rohanvashisht.bend.language.psi.BendVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.rohanvashisht.bend.language.psi.*;

public class BendModidImpl extends ASTWrapperPsiElement implements BendModid {

  public BendModidImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BendVisitor visitor) {
    visitor.visitModid(this);
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

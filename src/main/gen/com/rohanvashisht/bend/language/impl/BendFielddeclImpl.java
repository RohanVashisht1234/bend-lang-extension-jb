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

public class BendFielddeclImpl extends ASTWrapperPsiElement implements BendFielddecl {

  public BendFielddeclImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BendVisitor visitor) {
    visitor.visitFielddecl(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BendVisitor) accept((BendVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<BendPragma> getPragmaList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, BendPragma.class);
  }

  @Override
  @NotNull
  public List<BendQName> getQNameList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, BendQName.class);
  }

  @Override
  @NotNull
  public BendQNames getQNames() {
    return findNotNullChildByClass(BendQNames.class);
  }

  @Override
  @Nullable
  public BendScontext getScontext() {
    return findChildByClass(BendScontext.class);
  }

  @Override
  @Nullable
  public BendTtype getTtype() {
    return findChildByClass(BendTtype.class);
  }

}

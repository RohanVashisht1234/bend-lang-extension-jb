// This is a generated file. Not intended for manual editing.
package com.rohanvashisht.bend.language.impl;

import java.util.List;


import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.rohanvashisht.bend.language.psi.*;

public class BendTypeSignatureImpl extends ASTWrapperPsiElement implements BendTypeSignature {

  public BendTypeSignatureImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BendVisitor visitor) {
    visitor.visitTypeSignature(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BendVisitor) accept((BendVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<BendCcontext> getCcontextList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, BendCcontext.class);
  }

  @Override
  @NotNull
  public List<BendPragma> getPragmaList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, BendPragma.class);
  }

  @Override
  @NotNull
  public List<BendQNames> getQNamesList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, BendQNames.class);
  }

  @Override
  @NotNull
  public BendTtype getTtype() {
    return findNotNullChildByClass(BendTtype.class);
  }

}

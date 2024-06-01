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

public class BendTtypeImpl extends ASTWrapperPsiElement implements BendTtype {

  public BendTtypeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BendVisitor visitor) {
    visitor.visitTtype(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BendVisitor) accept((BendVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<BendDerivingVia> getDerivingViaList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, BendDerivingVia.class);
  }

  @Override
  @Nullable
  public BendListType getListType() {
    return findChildByClass(BendListType.class);
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
  public List<BendTextLiteral> getTextLiteralList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, BendTextLiteral.class);
  }

  @Override
  @NotNull
  public List<BendTtype> getTtypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, BendTtype.class);
  }

  @Override
  @NotNull
  public List<BendTypeSignature> getTypeSignatureList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, BendTypeSignature.class);
  }

}

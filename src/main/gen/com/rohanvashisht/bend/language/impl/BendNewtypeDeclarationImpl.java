// This is a generated file. Not intended for manual editing.
package com.rohanvashisht.bend.language.impl;

import java.util.List;

import com.rohanvashisht.bend.language.psi.*;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.extapi.psi.ASTWrapperPsiElement;

public class BendNewtypeDeclarationImpl extends ASTWrapperPsiElement implements BendNewtypeDeclaration {

  public BendNewtypeDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BendVisitor visitor) {
    visitor.visitNewtypeDeclaration(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BendVisitor) accept((BendVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public BendCcontext getCcontext() {
    return findChildByClass(BendCcontext.class);
  }

  @Override
  @NotNull
  public List<BendDerivingVia> getDerivingViaList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, BendDerivingVia.class);
  }

  @Override
  @NotNull
  public BendNewconstr getNewconstr() {
    return findNotNullChildByClass(BendNewconstr.class);
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
  public BendSimpletype getSimpletype() {
    return findNotNullChildByClass(BendSimpletype.class);
  }

  @Override
  @Nullable
  public BendTextLiteral getTextLiteral() {
    return findChildByClass(BendTextLiteral.class);
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

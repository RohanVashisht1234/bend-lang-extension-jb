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

public class BendDataDeclarationImpl extends ASTWrapperPsiElement implements BendDataDeclaration {

  public BendDataDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BendVisitor visitor) {
    visitor.visitDataDeclaration(this);
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
  public List<BendConstr> getConstrList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, BendConstr.class);
  }

  @Override
  @Nullable
  public BendDataDeclarationDeriving getDataDeclarationDeriving() {
    return findChildByClass(BendDataDeclarationDeriving.class);
  }

  @Override
  @NotNull
  public List<BendKindSignature> getKindSignatureList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, BendKindSignature.class);
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
  public BendTtype getTtype() {
    return findChildByClass(BendTtype.class);
  }

  @Override
  @NotNull
  public List<BendTypeSignature> getTypeSignatureList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, BendTypeSignature.class);
  }

}

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

public class BendInstanceDeclarationImpl extends ASTWrapperPsiElement implements BendInstanceDeclaration {

  public BendInstanceDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BendVisitor visitor) {
    visitor.visitInstanceDeclaration(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BendVisitor) accept((BendVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public BendCidecls getCidecls() {
    return findChildByClass(BendCidecls.class);
  }

  @Override
  @Nullable
  public BendInst getInst() {
    return findChildByClass(BendInst.class);
  }

  @Override
  @NotNull
  public List<BendPragma> getPragmaList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, BendPragma.class);
  }

  @Override
  @Nullable
  public BendQName getQName() {
    return findChildByClass(BendQName.class);
  }

  @Override
  @Nullable
  public BendScontext getScontext() {
    return findChildByClass(BendScontext.class);
  }

  @Override
  @Nullable
  public BendTypeEquality getTypeEquality() {
    return findChildByClass(BendTypeEquality.class);
  }

  @Override
  @NotNull
  public List<BendVarid> getVaridList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, BendVarid.class);
  }

}

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

public class BendTypeFamilyDeclarationImpl extends ASTWrapperPsiElement implements BendTypeFamilyDeclaration {

  public BendTypeFamilyDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BendVisitor visitor) {
    visitor.visitTypeFamilyDeclaration(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BendVisitor) accept((BendVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public BendExpression getExpression() {
    return findChildByClass(BendExpression.class);
  }

  @Override
  @NotNull
  public List<BendPragma> getPragmaList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, BendPragma.class);
  }

  @Override
  @NotNull
  public BendTypeFamilyType getTypeFamilyType() {
    return findNotNullChildByClass(BendTypeFamilyType.class);
  }

}

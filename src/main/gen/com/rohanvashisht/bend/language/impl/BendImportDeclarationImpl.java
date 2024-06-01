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

public class BendImportDeclarationImpl extends ASTWrapperPsiElement implements BendImportDeclaration {

  public BendImportDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BendVisitor visitor) {
    visitor.visitImportDeclaration(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BendVisitor) accept((BendVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public BendImportPackageName getImportPackageName() {
    return findChildByClass(BendImportPackageName.class);
  }

  @Override
  @Nullable
  public BendImportQualified getImportQualified() {
    return findChildByClass(BendImportQualified.class);
  }

  @Override
  @Nullable
  public BendImportQualifiedAs getImportQualifiedAs() {
    return findChildByClass(BendImportQualifiedAs.class);
  }

  @Override
  @Nullable
  public BendImportSpec getImportSpec() {
    return findChildByClass(BendImportSpec.class);
  }

  @Override
  @Nullable
  public BendModid getModid() {
    return findChildByClass(BendModid.class);
  }

  @Override
  @NotNull
  public List<BendPragma> getPragmaList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, BendPragma.class);
  }

}

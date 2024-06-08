// This is a generated file. Not intended for manual editing.
package com.rohanvashisht.bend.language.impl;


import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.rohanvashisht.bend.language.psi.*;

public class BendTopDeclarationImpl extends ASTWrapperPsiElement implements BendTopDeclaration {

  public BendTopDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BendVisitor visitor) {
    visitor.visitTopDeclaration(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BendVisitor) accept((BendVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public BendClassDeclaration getClassDeclaration() {
    return findChildByClass(BendClassDeclaration.class);
  }

  @Override
  @Nullable
  public BendDataDeclaration getDataDeclaration() {
    return findChildByClass(BendDataDeclaration.class);
  }

  @Override
  @Nullable
  public BendDefaultDeclaration getDefaultDeclaration() {
    return findChildByClass(BendDefaultDeclaration.class);
  }

  @Override
  @Nullable
  public BendDerivingDeclaration getDerivingDeclaration() {
    return findChildByClass(BendDerivingDeclaration.class);
  }

  @Override
  @Nullable
  public BendExpression getExpression() {
    return findChildByClass(BendExpression.class);
  }

  @Override
  @Nullable
  public BendFixityDeclaration getFixityDeclaration() {
    return findChildByClass(BendFixityDeclaration.class);
  }

  @Override
  @Nullable
  public BendForeignDeclaration getForeignDeclaration() {
    return findChildByClass(BendForeignDeclaration.class);
  }

  @Override
  @Nullable
  public BendInstanceDeclaration getInstanceDeclaration() {
    return findChildByClass(BendInstanceDeclaration.class);
  }

  @Override
  @Nullable
  public BendNewtypeDeclaration getNewtypeDeclaration() {
    return findChildByClass(BendNewtypeDeclaration.class);
  }

  @Override
  @Nullable
  public BendPragma getPragma() {
    return findChildByClass(BendPragma.class);
  }

  @Override
  @Nullable
  public BendTypeDeclaration getTypeDeclaration() {
    return findChildByClass(BendTypeDeclaration.class);
  }

  @Override
  @Nullable
  public BendTypeFamilyDeclaration getTypeFamilyDeclaration() {
    return findChildByClass(BendTypeFamilyDeclaration.class);
  }

  @Override
  @Nullable
  public BendTypeInstanceDeclaration getTypeInstanceDeclaration() {
    return findChildByClass(BendTypeInstanceDeclaration.class);
  }

  @Override
  @Nullable
  public BendTypeSignature getTypeSignature() {
    return findChildByClass(BendTypeSignature.class);
  }

}

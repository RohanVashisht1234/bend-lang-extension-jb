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

public class BendCideclImpl extends ASTWrapperPsiElement implements BendCidecl {

  public BendCideclImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BendVisitor visitor) {
    visitor.visitCidecl(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BendVisitor) accept((BendVisitor)visitor);
    else super.accept(visitor);
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
  @NotNull
  public List<BendDotDot> getDotDotList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, BendDotDot.class);
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
  @NotNull
  public List<BendQName> getQNameList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, BendQName.class);
  }

  @Override
  @NotNull
  public List<BendQuasiQuote> getQuasiQuoteList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, BendQuasiQuote.class);
  }

  @Override
  @NotNull
  public List<BendTextLiteral> getTextLiteralList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, BendTextLiteral.class);
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

}

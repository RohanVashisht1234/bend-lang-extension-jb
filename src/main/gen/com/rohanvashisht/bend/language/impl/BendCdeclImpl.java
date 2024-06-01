// This is a generated file. Not intended for manual editing.
package com.rohanvashisht.bend.language.impl;

import com.rohanvashisht.bend.language.psi.*;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.rohanvashisht.bend.language.psi.*;

public class BendCdeclImpl extends ASTWrapperPsiElement implements BendCdecl {

  public BendCdeclImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BendVisitor visitor) {
    visitor.visitCdecl(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BendVisitor) accept((BendVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public BendCdeclDataDeclaration getCdeclDataDeclaration() {
    return findChildByClass(BendCdeclDataDeclaration.class);
  }

  @Override
  @Nullable
  public BendCidecl getCidecl() {
    return findChildByClass(BendCidecl.class);
  }

  @Override
  @Nullable
  public BendTypeSignature getTypeSignature() {
    return findChildByClass(BendTypeSignature.class);
  }

}

// This is a generated file. Not intended for manual editing.
package com.rohanvashisht.bend.language.impl;

import com.rohanvashisht.bend.language.psi.BendQuasiQuote;
import com.rohanvashisht.bend.language.psi.BendVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;


public class BendQuasiQuoteImpl extends ASTWrapperPsiElement implements BendQuasiQuote {

  public BendQuasiQuoteImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BendVisitor visitor) {
    visitor.visitQuasiQuote(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BendVisitor) accept((BendVisitor)visitor);
    else super.accept(visitor);
  }

}

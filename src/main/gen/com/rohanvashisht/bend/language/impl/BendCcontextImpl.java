// This is a generated file. Not intended for manual editing.
package com.rohanvashisht.bend.language.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import com.rohanvashisht.bend.language.psi.BendCcontext;
import com.rohanvashisht.bend.language.psi.BendClazz;
import com.rohanvashisht.bend.language.psi.BendPragma;
import com.rohanvashisht.bend.language.psi.BendVisitor;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class BendCcontextImpl extends ASTWrapperPsiElement implements BendCcontext {

  public BendCcontextImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BendVisitor visitor) {
    visitor.visitCcontext(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BendVisitor) accept((BendVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<BendClazz> getClazzList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, BendClazz.class);
  }

  @Override
  @NotNull
  public List<BendPragma> getPragmaList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, BendPragma.class);
  }

}

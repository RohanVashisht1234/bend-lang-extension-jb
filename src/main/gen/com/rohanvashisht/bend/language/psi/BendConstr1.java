// This is a generated file. Not intended for manual editing.
package com.rohanvashisht.bend.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface BendConstr1 extends PsiElement {

  @NotNull
  List<BendFielddecl> getFielddeclList();

  @NotNull
  List<BendPragma> getPragmaList();

  @Nullable
  BendQName getQName();

}

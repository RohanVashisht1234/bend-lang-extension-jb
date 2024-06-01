// This is a generated file. Not intended for manual editing.
package com.rohanvashisht.bend.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface BendFielddecl extends PsiElement {

  @NotNull
  List<BendPragma> getPragmaList();

  @NotNull
  List<BendQName> getQNameList();

  @NotNull
  BendQNames getQNames();

  @Nullable
  BendScontext getScontext();

  @Nullable
  BendTtype getTtype();

}

// This is a generated file. Not intended for manual editing.
package com.rohanvashisht.bend.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface BendClassDeclaration extends PsiElement {

  @Nullable
  BendCdecls getCdecls();

  @NotNull
  List<BendPragma> getPragmaList();

  @NotNull
  List<BendQName> getQNameList();

  @Nullable
  BendScontext getScontext();

  @NotNull
  List<BendTtype> getTtypeList();

}

// This is a generated file. Not intended for manual editing.
package com.rohanvashisht.bend.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface BendDerivingDeclaration extends PsiElement {

  @NotNull
  BendInst getInst();

  @NotNull
  List<BendPragma> getPragmaList();

  @NotNull
  BendQName getQName();

  @Nullable
  BendScontext getScontext();

}

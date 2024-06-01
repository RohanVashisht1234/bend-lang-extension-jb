// This is a generated file. Not intended for manual editing.
package com.rohanvashisht.bend.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface BendTypeSignature extends PsiElement {

  @NotNull
  List<BendCcontext> getCcontextList();

  @NotNull
  List<BendPragma> getPragmaList();

  @NotNull
  List<BendQNames> getQNamesList();

  @NotNull
  BendTtype getTtype();

}

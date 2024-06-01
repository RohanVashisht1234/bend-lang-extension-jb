// This is a generated file. Not intended for manual editing.
package com.rohanvashisht.bend.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface BendInstanceDeclaration extends PsiElement {

  @Nullable
  BendCidecls getCidecls();

  @Nullable
  BendInst getInst();

  @NotNull
  List<BendPragma> getPragmaList();

  @Nullable
  BendQName getQName();

  @Nullable
  BendScontext getScontext();

  @Nullable
  BendTypeEquality getTypeEquality();

  @NotNull
  List<BendVarid> getVaridList();

}

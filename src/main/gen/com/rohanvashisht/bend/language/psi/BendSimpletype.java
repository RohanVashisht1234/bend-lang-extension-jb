// This is a generated file. Not intended for manual editing.
package com.rohanvashisht.bend.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface BendSimpletype extends PsiElement {

  @NotNull
  List<BendPragma> getPragmaList();

  @NotNull
  List<BendQName> getQNameList();

  @Nullable
  BendTtype getTtype();

  @NotNull
  List<BendTypeSignature> getTypeSignatureList();

  //WARNING: getIdentifierElements(...) is skipped
  //matching getIdentifierElements(BendSimpletype, ...)
  //methods are not found in null

}

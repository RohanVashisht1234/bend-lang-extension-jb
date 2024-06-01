// This is a generated file. Not intended for manual editing.
package com.rohanvashisht.bend.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface BendTtype extends PsiElement {

  @NotNull
  List<BendDerivingVia> getDerivingViaList();

  @Nullable
  BendListType getListType();

  @NotNull
  List<BendPragma> getPragmaList();

  @NotNull
  List<BendQName> getQNameList();

  @NotNull
  List<BendTextLiteral> getTextLiteralList();

  @NotNull
  List<BendTtype> getTtypeList();

  @NotNull
  List<BendTypeSignature> getTypeSignatureList();

}

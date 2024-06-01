// This is a generated file. Not intended for manual editing.
package com.rohanvashisht.bend.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface BendClazz extends PsiElement {

  @NotNull
  List<BendDerivingVia> getDerivingViaList();

  @NotNull
  List<BendPragma> getPragmaList();

  @NotNull
  List<BendQName> getQNameList();

  @NotNull
  List<BendTextLiteral> getTextLiteralList();

  @Nullable
  BendTtype getTtype();

  @NotNull
  List<BendTypeSignature> getTypeSignatureList();

}

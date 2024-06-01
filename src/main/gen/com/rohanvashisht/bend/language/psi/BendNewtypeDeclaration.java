// This is a generated file. Not intended for manual editing.
package com.rohanvashisht.bend.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface BendNewtypeDeclaration extends PsiElement {

  @Nullable
  BendCcontext getCcontext();

  @NotNull
  List<BendDerivingVia> getDerivingViaList();

  @NotNull
  BendNewconstr getNewconstr();

  @NotNull
  List<BendPragma> getPragmaList();

  @NotNull
  List<BendQName> getQNameList();

  @NotNull
  BendSimpletype getSimpletype();

  @Nullable
  BendTextLiteral getTextLiteral();

  @NotNull
  List<BendTtype> getTtypeList();

  @NotNull
  List<BendTypeSignature> getTypeSignatureList();

}

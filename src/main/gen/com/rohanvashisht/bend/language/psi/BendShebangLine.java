// This is a generated file. Not intended for manual editing.
package com.rohanvashisht.bend.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface BendShebangLine extends PsiElement {

  @NotNull
  List<BendDotDot> getDotDotList();

  @NotNull
  List<BendPragma> getPragmaList();

  @NotNull
  List<BendQName> getQNameList();

  @NotNull
  List<BendQuasiQuote> getQuasiQuoteList();

  @NotNull
  List<BendTextLiteral> getTextLiteralList();

}

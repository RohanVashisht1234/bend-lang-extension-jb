// This is a generated file. Not intended for manual editing.
package com.rohanvashisht.bend.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface BendCidecl extends PsiElement {

  @Nullable
  BendDataDeclaration getDataDeclaration();

  @Nullable
  BendDefaultDeclaration getDefaultDeclaration();

  @NotNull
  List<BendDotDot> getDotDotList();

  @Nullable
  BendInstanceDeclaration getInstanceDeclaration();

  @Nullable
  BendNewtypeDeclaration getNewtypeDeclaration();

  @Nullable
  BendPragma getPragma();

  @NotNull
  List<BendQName> getQNameList();

  @NotNull
  List<BendQuasiQuote> getQuasiQuoteList();

  @NotNull
  List<BendTextLiteral> getTextLiteralList();

  @Nullable
  BendTypeDeclaration getTypeDeclaration();

  @Nullable
  BendTypeFamilyDeclaration getTypeFamilyDeclaration();

}

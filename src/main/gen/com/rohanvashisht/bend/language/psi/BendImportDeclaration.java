// This is a generated file. Not intended for manual editing.
package com.rohanvashisht.bend.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface BendImportDeclaration extends PsiElement {

  @Nullable
  BendImportPackageName getImportPackageName();

  @Nullable
  BendImportQualified getImportQualified();

  @Nullable
  BendImportQualifiedAs getImportQualifiedAs();

  @Nullable
  BendImportSpec getImportSpec();

  @Nullable
  BendModid getModid();

  @NotNull
  List<BendPragma> getPragmaList();

  //WARNING: getModuleName(...) is skipped
  //matching getModuleName(BendImportDeclaration, ...)
  //methods are not found in null

}

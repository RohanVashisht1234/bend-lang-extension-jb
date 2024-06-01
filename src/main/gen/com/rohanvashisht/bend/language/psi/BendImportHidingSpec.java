// This is a generated file. Not intended for manual editing.
package com.rohanvashisht.bend.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface BendImportHidingSpec extends PsiElement {

  @NotNull
  BendImportHiding getImportHiding();

  @NotNull
  List<BendImportId> getImportIdList();

  @NotNull
  List<BendPragma> getPragmaList();

}

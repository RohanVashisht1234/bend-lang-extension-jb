// This is a generated file. Not intended for manual editing.
package com.rohanvashisht.bend.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface BendTypeFamilyType extends PsiElement {

  @NotNull
  List<BendCcontext> getCcontextList();

  @NotNull
  List<BendPragma> getPragmaList();

  @NotNull
  List<BendQName> getQNameList();

  @NotNull
  List<BendQNames> getQNamesList();

  @NotNull
  List<BendTtype> getTtypeList();

}

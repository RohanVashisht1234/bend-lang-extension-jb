// This is a generated file. Not intended for manual editing.
package com.rohanvashisht.bend.language.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface BendTopDeclaration extends PsiElement {

  @Nullable
  BendClassDeclaration getClassDeclaration();

  @Nullable
  BendDataDeclaration getDataDeclaration();

  @Nullable
  BendDefaultDeclaration getDefaultDeclaration();

  @Nullable
  BendDerivingDeclaration getDerivingDeclaration();

  @Nullable
  BendExpression getExpression();

  @Nullable
  BendFixityDeclaration getFixityDeclaration();

  @Nullable
  BendForeignDeclaration getForeignDeclaration();

  @Nullable
  BendInstanceDeclaration getInstanceDeclaration();

  @Nullable
  BendNewtypeDeclaration getNewtypeDeclaration();

  @Nullable
  BendPragma getPragma();

  @Nullable
  BendTypeDeclaration getTypeDeclaration();

  @Nullable
  BendTypeFamilyDeclaration getTypeFamilyDeclaration();

  @Nullable
  BendTypeInstanceDeclaration getTypeInstanceDeclaration();

  @Nullable
  BendTypeSignature getTypeSignature();

}

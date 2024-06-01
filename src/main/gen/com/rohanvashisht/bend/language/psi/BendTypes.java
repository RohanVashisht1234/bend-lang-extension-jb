// This is a generated file. Not intended for manual editing.
package com.rohanvashisht.bend.language.psi;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;
import com.rohanvashisht.bend.language.impl.*;

public interface BendTypes {

  IElementType BEND_CCONTEXT = new BendElementType("BEND_CCONTEXT");
  IElementType BEND_CDECL = new BendElementType("BEND_CDECL");
  IElementType BEND_CDECLS = new BendElementType("BEND_CDECLS");
  IElementType BEND_CDECL_DATA_DECLARATION = new BendElementType("BEND_CDECL_DATA_DECLARATION");
  IElementType BEND_CIDECL = new BendElementType("BEND_CIDECL");
  IElementType BEND_CIDECLS = new BendElementType("BEND_CIDECLS");
  IElementType BEND_CLASS_DECLARATION = new BendElementType("BEND_CLASS_DECLARATION");
  IElementType BEND_CLAZZ = new BendElementType("BEND_CLAZZ");
  IElementType BEND_COMMENTS = new BendElementType("BEND_COMMENTS");
  IElementType BEND_CONID = new BendElementType("BEND_CONID");
  IElementType BEND_CONSTR = new BendElementType("BEND_CONSTR");
  IElementType BEND_CONSTR_1 = new BendElementType("BEND_CONSTR_1");
  IElementType BEND_CONSTR_2 = new BendElementType("BEND_CONSTR_2");
  IElementType BEND_CONSTR_3 = new BendElementType("BEND_CONSTR_3");
  IElementType BEND_CONSYM = new BendElementType("BEND_CONSYM");
  IElementType BEND_DEF = new BendElementType("BEND_DEF");
  IElementType BEND_DEL = new BendElementType("BEND_DEL");
  IElementType BEND_RETURN = new BendElementType("BEND_RETURN");
  IElementType BEND_TRY = new BendElementType("BEND_TRY");
  IElementType BEND_MATCH = new BendElementType("BEND_MATCH");

  IElementType BEND_YIELD = new BendElementType("BEND_YIELD");
  IElementType BEND_ASSERT = new BendElementType("BEND_ASSERT");
  IElementType BEND_EXCEPT = new BendElementType("BEND_EXCEPT");
  IElementType BEND_GLOBAL = new BendElementType("BEND_GLOBAL");
  IElementType BEND_LAMBDA = new BendElementType("BEND_LAMBDA");
  IElementType BEND_FINALLY = new BendElementType("BEND_FINALLY");
  IElementType BEND_CONTINUE = new BendElementType("BEND_CONTINUE");
  IElementType BEND_NONLOCAL = new BendElementType("BEND_NONLOCAL");



  IElementType BEND_FROM = new BendElementType("BEND_FROM");
  IElementType BEND_BREAK = new BendElementType("BEND_BREAK");
  IElementType BEND_PASS = new BendElementType("BEND_PASS");
  IElementType BEND_RAISE = new BendElementType("BEND_RAISE");
  IElementType BEND_DATA_DECLARATION = new BendElementType("BEND_DATA_DECLARATION");
  IElementType BEND_DATA_DECLARATION_DERIVING = new BendElementType("BEND_DATA_DECLARATION_DERIVING");
  IElementType BEND_DEFAULT_DECLARATION = new BendElementType("BEND_DEFAULT_DECLARATION");
  IElementType BEND_DERIVING_DECLARATION = new BendElementType("BEND_DERIVING_DECLARATION");
  IElementType BEND_DERIVING_VIA = new BendElementType("BEND_DERIVING_VIA");
  IElementType BEND_DOT_DOT = new BendElementType("BEND_DOT_DOT");
  IElementType BEND_EXPORT = new BendElementType("BEND_EXPORT");
  IElementType BEND_EXPORTS = new BendElementType("BEND_EXPORTS");
  IElementType BEND_EXPRESSION = new BendElementType("BEND_EXPRESSION");
  IElementType BEND_FIELDDECL = new BendElementType("BEND_FIELDDECL");
  IElementType BEND_FILE_HEADER = new BendElementType("BEND_FILE_HEADER");
  IElementType BEND_FIXITY_DECLARATION = new BendElementType("BEND_FIXITY_DECLARATION");
  IElementType BEND_FOREIGN_DECLARATION = new BendElementType("BEND_FOREIGN_DECLARATION");
  IElementType BEND_GENERAL_PRAGMA_CONTENT = new BendElementType("BEND_GENERAL_PRAGMA_CONTENT");
  IElementType BEND_GTYCON = new BendElementType("BEND_GTYCON");
  IElementType BEND_IMPORT_DECLARATION = new BendElementType("BEND_IMPORT_DECLARATION");
  IElementType BEND_IMPORT_DECLARATIONS = new BendElementType("BEND_IMPORT_DECLARATIONS");
  IElementType BEND_IMPORT_EMPTY_SPEC = new BendElementType("BEND_IMPORT_EMPTY_SPEC");
  IElementType BEND_IMPORT_HIDING = new BendElementType("BEND_IMPORT_HIDING");
  IElementType BEND_IMPORT_HIDING_SPEC = new BendElementType("BEND_IMPORT_HIDING_SPEC");
  IElementType BEND_IMPORT_ID = new BendElementType("BEND_IMPORT_ID");
  IElementType BEND_IMPORT_IDS_SPEC = new BendElementType("BEND_IMPORT_IDS_SPEC");
  IElementType BEND_IMPORT_PACKAGE_NAME = new BendElementType("BEND_IMPORT_PACKAGE_NAME");
  IElementType BEND_IMPORT_QUALIFIED = new BendElementType("BEND_IMPORT_QUALIFIED");
  IElementType BEND_IMPORT_QUALIFIED_AS = new BendElementType("BEND_IMPORT_QUALIFIED_AS");
  IElementType BEND_IMPORT_SPEC = new BendElementType("BEND_IMPORT_SPEC");
  IElementType BEND_INST = new BendElementType("BEND_INST");
  IElementType BEND_INSTANCE_DECLARATION = new BendElementType("BEND_INSTANCE_DECLARATION");
  IElementType BEND_INSTVAR = new BendElementType("BEND_INSTVAR");
  IElementType BEND_KIND_SIGNATURE = new BendElementType("BEND_KIND_SIGNATURE");
  IElementType BEND_LIST_TYPE = new BendElementType("BEND_LIST_TYPE");
  IElementType BEND_MODID = new BendElementType("BEND_MODID");
  IElementType BEND_MODULE_BODY = new BendElementType("BEND_MODULE_BODY");
  IElementType BEND_MODULE_DECLARATION = new BendElementType("BEND_MODULE_DECLARATION");
  IElementType BEND_NEWCONSTR = new BendElementType("BEND_NEWCONSTR");
  IElementType BEND_NEWCONSTR_FIELDDECL = new BendElementType("BEND_NEWCONSTR_FIELDDECL");
  IElementType BEND_NEWTYPE_DECLARATION = new BendElementType("BEND_NEWTYPE_DECLARATION");
  IElementType BEND_PRAGMA = new BendElementType("BEND_PRAGMA");
  IElementType BEND_QUALIFIER = new BendElementType("BEND_QUALIFIER");
  IElementType BEND_QUASI_QUOTE = new BendElementType("BEND_QUASI_QUOTE");
  IElementType BEND_Q_CON = new BendElementType("BEND_Q_CON");
  IElementType BEND_Q_CON_QUALIFIER = new BendElementType("BEND_Q_CON_QUALIFIER");
  IElementType BEND_Q_CON_QUALIFIER_1 = new BendElementType("BEND_Q_CON_QUALIFIER_1");
  IElementType BEND_Q_CON_QUALIFIER_2 = new BendElementType("BEND_Q_CON_QUALIFIER_2");
  IElementType BEND_Q_CON_QUALIFIER_3 = new BendElementType("BEND_Q_CON_QUALIFIER_3");
  IElementType BEND_Q_CON_QUALIFIER_4 = new BendElementType("BEND_Q_CON_QUALIFIER_4");
  IElementType BEND_Q_NAME = new BendElementType("BEND_Q_NAME");
  IElementType BEND_Q_NAMES = new BendElementType("BEND_Q_NAMES");
  IElementType BEND_Q_VAR_CON = new BendElementType("BEND_Q_VAR_CON");
  IElementType BEND_SCONTEXT = new BendElementType("BEND_SCONTEXT");
  IElementType BEND_SHEBANG_LINE = new BendElementType("BEND_SHEBANG_LINE");
  IElementType BEND_SIMPLECLASS = new BendElementType("BEND_SIMPLECLASS");
  IElementType BEND_SIMPLETYPE = new BendElementType("BEND_SIMPLETYPE");
  IElementType BEND_TEXT_LITERAL = new BendElementType("BEND_TEXT_LITERAL");
  IElementType BEND_TOP_DECLARATION = new BendElementType("BEND_TOP_DECLARATION");
  IElementType BEND_TTYPE = new BendElementType("BEND_TTYPE");
  IElementType BEND_TYPE_DECLARATION = new BendElementType("BEND_TYPE_DECLARATION");
  IElementType BEND_TYPE_EQUALITY = new BendElementType("BEND_TYPE_EQUALITY");
  IElementType BEND_TYPE_FAMILY_DECLARATION = new BendElementType("BEND_TYPE_FAMILY_DECLARATION");
  IElementType BEND_TYPE_FAMILY_TYPE = new BendElementType("BEND_TYPE_FAMILY_TYPE");
  IElementType BEND_TYPE_INSTANCE_DECLARATION = new BendElementType("BEND_TYPE_INSTANCE_DECLARATION");
  IElementType BEND_TYPE_SIGNATURE = new BendElementType("BEND_TYPE_SIGNATURE");
  IElementType BEND_VARID = new BendElementType("BEND_VARID");
  IElementType BEND_VARSYM = new BendElementType("BEND_VARSYM");
  IElementType BEND_VAR_CON = new BendElementType("BEND_VAR_CON");

  IElementType BEND_AT = new BendTokenType("AT");
  IElementType BEND_BACKQUOTE = new BendTokenType("BACKQUOTE");
  IElementType BEND_BACKSLASH = new BendTokenType("BACKSLASH");
  IElementType BEND_CASE = new BendTokenType("BEND_CASE");
  IElementType BEND_CHARACTER_LITERAL = new BendTokenType("CHARACTER_LITERAL");
  IElementType BEND_CLASS = new BendTokenType("CLASS");
  IElementType BEND_COLON_COLON = new BendTokenType("COLON_COLON");
  IElementType BEND_COMMA = new BendTokenType("COMMA");
  IElementType BEND_COMMENT = new BendTokenType("COMMENT");
  IElementType BEND_CONSYM_ID = new BendTokenType("CONSYM_ID");
  IElementType BEND_CON_ID = new BendTokenType("CON_ID");
  IElementType BEND_DASH = new BendTokenType("DASH");
  IElementType BEND_DATA = new BendTokenType("DATA");
  IElementType BEND_DECIMAL = new BendTokenType("DECIMAL");
  IElementType BEND_DEFAULT = new BendTokenType("DEFAULT");
  IElementType BEND_DERIVING = new BendTokenType("DERIVING");
  IElementType BEND_DIRECTIVE = new BendTokenType("DIRECTIVE");
  IElementType BEND_DO = new BendTokenType("DO");
  IElementType BEND_DOT = new BendTokenType("DOT");
  IElementType BEND_DOUBLE_QUOTES = new BendTokenType("DOUBLE_QUOTES");
  IElementType BEND_DOUBLE_RIGHT_ARROW = new BendTokenType("DOUBLE_RIGHT_ARROW");
  IElementType BEND_ELSE = new BendTokenType("ELSE");
  IElementType BEND_EQUAL = new BendTokenType("EQUAL");
  IElementType BEND_FLOAT = new BendTokenType("FLOAT");
  IElementType BEND_FORALL = new BendTokenType("FORALL");
  IElementType BEND_FOREIGN_EXPORT = new BendTokenType("FOREIGN_EXPORT");
  IElementType BEND_FOREIGN_IMPORT = new BendTokenType("FOREIGN_IMPORT");
  IElementType BEND_HADDOCK = new BendTokenType("HADDOCK");
  IElementType BEND_HASH = new BendTokenType("HASH");
  IElementType BEND_HEXADECIMAL = new BendTokenType("HEXADECIMAL");
  IElementType BEND_IF = new BendTokenType("IF");
  IElementType BEND_IMPORT = new BendTokenType("IMPORT");
  IElementType BEND_IN = new BendTokenType("IN");
  IElementType BEND_INCLUDE_DIRECTIVE = new BendTokenType("INCLUDE_DIRECTIVE");
  IElementType BEND_INFIX = new BendTokenType("INFIX");
  IElementType BEND_INFIXL = new BendTokenType("INFIXL");
  IElementType BEND_INFIXR = new BendTokenType("INFIXR");
  IElementType BEND_INSTANCE = new BendTokenType("INSTANCE");
  IElementType BEND_LEFT_ARROW = new BendTokenType("LEFT_ARROW");
  IElementType BEND_LEFT_BRACE = new BendTokenType("LEFT_BRACE");
  IElementType BEND_LEFT_BRACKET = new BendTokenType("LEFT_BRACKET");
  IElementType BEND_LEFT_PAREN = new BendTokenType("LEFT_PAREN");
  IElementType BEND_LET = new BendTokenType("LET");
  IElementType BEND_LIST_COMPREHENSION = new BendTokenType("LIST_COMPREHENSION");
  IElementType BEND_MODULE = new BendTokenType("MODULE");
  IElementType BEND_NCOMMENT = new BendTokenType("NCOMMENT");
  IElementType BEND_NEWLINE = new BendTokenType("NEWLINE");
  IElementType BEND_NEWTYPE = new BendTokenType("NEWTYPE");
  IElementType BEND_NHADDOCK = new BendTokenType("NHADDOCK");
  IElementType BEND_NOT_TERMINATED_COMMENT = new BendTokenType("NOT_TERMINATED_COMMENT");
  IElementType BEND_NOT_TERMINATED_QQ_EXPRESSION = new BendTokenType("NOT_TERMINATED_QQ_EXPRESSION");
  IElementType BEND_OCTAL = new BendTokenType("OCTAL");
  IElementType BEND_OF = new BendTokenType("OF");
  IElementType BEND_ONE_PRAGMA = new BendTokenType("ONE_PRAGMA");
  IElementType BEND_PRAGMA_END = new BendTokenType("PRAGMA_END");
  IElementType BEND_PRAGMA_SEP = new BendTokenType("PRAGMA_SEP");
  IElementType BEND_PRAGMA_START = new BendTokenType("PRAGMA_START");
  IElementType BEND_QUASIQUOTE = new BendTokenType("QUASIQUOTE");
  IElementType BEND_QUOTE = new BendTokenType("QUOTE");
  IElementType BEND_RIGHT_ARROW = new BendTokenType("RIGHT_ARROW");
  IElementType BEND_RIGHT_BRACE = new BendTokenType("RIGHT_BRACE");
  IElementType BEND_RIGHT_BRACKET = new BendTokenType("RIGHT_BRACKET");
  IElementType BEND_RIGHT_PAREN = new BendTokenType("RIGHT_PAREN");
  IElementType BEND_SEMICOLON = new BendTokenType("SEMICOLON");
  IElementType BEND_STRING_LITERAL = new BendTokenType("STRING_LITERAL");
  IElementType BEND_THEN = new BendTokenType("THEN");
  IElementType BEND_TILDE = new BendTokenType("TILDE");
  IElementType BEND_TYPE = new BendTokenType("TYPE");
  IElementType BEND_TYPE_FAMILY = new BendTokenType("TYPE_FAMILY");
  IElementType BEND_TYPE_INSTANCE = new BendTokenType("TYPE_INSTANCE");
  IElementType BEND_UNDERSCORE = new BendTokenType("UNDERSCORE");
  IElementType BEND_VARSYM_ID = new BendTokenType("VARSYM_ID");
  IElementType BEND_VAR_ID = new BendTokenType("VAR_ID");
  IElementType BEND_VERTICAL_BAR = new BendTokenType("VERTICAL_BAR");
  IElementType BEND_WHERE = new BendTokenType("WHERE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == BEND_CCONTEXT) {
        return new BendCcontextImpl(node);
      }
      else if (type == BEND_CDECL) {
        return new BendCdeclImpl(node);
      }
      else if (type == BEND_CDECLS) {
        return new BendCdeclsImpl(node);
      }
      else if (type == BEND_CDECL_DATA_DECLARATION) {
        return new BendCdeclDataDeclarationImpl(node);
      }
      else if (type == BEND_CIDECL) {
        return new BendCideclImpl(node);
      }
      else if (type == BEND_CIDECLS) {
        return new BendCideclsImpl(node);
      }
      else if (type == BEND_CLASS_DECLARATION) {
        return new BendClassDeclarationImpl(node);
      }
      else if (type == BEND_CLAZZ) {
        return new BendClazzImpl(node);
      }
      else if (type == BEND_COMMENTS) {
        return new BendCommentsImpl(node);
      }
      else if (type == BEND_CONID) {
        return new BendConidImpl(node);
      }
      else if (type == BEND_CONSTR) {
        return new BendConstrImpl(node);
      }
      else if (type == BEND_CONSTR_1) {
        return new BendConstr1Impl(node);
      }
      else if (type == BEND_CONSTR_2) {
        return new BendConstr2Impl(node);
      }
      else if (type == BEND_CONSTR_3) {
        return new BendConstr3Impl(node);
      }
      else if (type == BEND_CONSYM) {
        return new BendConsymImpl(node);
      }
      else if (type == BEND_DATA_DECLARATION) {
        return new BendDataDeclarationImpl(node);
      }
      else if (type == BEND_DATA_DECLARATION_DERIVING) {
        return new BendDataDeclarationDerivingImpl(node);
      }
      else if (type == BEND_DEFAULT_DECLARATION) {
        return new BendDefaultDeclarationImpl(node);
      }
      else if (type == BEND_DERIVING_DECLARATION) {
        return new BendDerivingDeclarationImpl(node);
      }
      else if (type == BEND_DERIVING_VIA) {
        return new BendDerivingViaImpl(node);
      }
      else if (type == BEND_DOT_DOT) {
        return new BendDotDotImpl(node);
      }
      else if (type == BEND_EXPORT) {
        return new BendExportImpl(node);
      }
      else if (type == BEND_EXPORTS) {
        return new BendExportsImpl(node);
      }
      else if (type == BEND_EXPRESSION) {
        return new BendExpressionImpl(node);
      }
      else if (type == BEND_FIELDDECL) {
        return new BendFielddeclImpl(node);
      }
      else if (type == BEND_FILE_HEADER) {
        return new BendFileHeaderImpl(node);
      }
      else if (type == BEND_FIXITY_DECLARATION) {
        return new BendFixityDeclarationImpl(node);
      }
      else if (type == BEND_FOREIGN_DECLARATION) {
        return new BendForeignDeclarationImpl(node);
      }
      else if (type == BEND_GENERAL_PRAGMA_CONTENT) {
        return new BendGeneralPragmaContentImpl(node);
      }
      else if (type == BEND_GTYCON) {
        return new BendGtyconImpl(node);
      }
      else if (type == BEND_IMPORT_DECLARATION) {
        return new BendImportDeclarationImpl(node);
      }
      else if (type == BEND_IMPORT_DECLARATIONS) {
        return new BendImportDeclarationsImpl(node);
      }
      else if (type == BEND_IMPORT_EMPTY_SPEC) {
        return new BendImportEmptySpecImpl(node);
      }
      else if (type == BEND_IMPORT_HIDING) {
        return new BendImportHidingImpl(node);
      }
      else if (type == BEND_IMPORT_HIDING_SPEC) {
        return new BendImportHidingSpecImpl(node);
      }
      else if (type == BEND_IMPORT_ID) {
        return new BendImportIdImpl(node);
      }
      else if (type == BEND_IMPORT_IDS_SPEC) {
        return new BendImportIdsSpecImpl(node);
      }
      else if (type == BEND_IMPORT_PACKAGE_NAME) {
        return new BendImportPackageNameImpl(node);
      }
      else if (type == BEND_IMPORT_QUALIFIED) {
        return new BendImportQualifiedImpl(node);
      }
      else if (type == BEND_IMPORT_QUALIFIED_AS) {
        return new BendImportQualifiedAsImpl(node);
      }
      else if (type == BEND_IMPORT_SPEC) {
        return new BendImportSpecImpl(node);
      }
      else if (type == BEND_INST) {
        return new BendInstImpl(node);
      }
      else if (type == BEND_INSTANCE_DECLARATION) {
        return new BendInstanceDeclarationImpl(node);
      }
      else if (type == BEND_INSTVAR) {
        return new BendInstvarImpl(node);
      }
      else if (type == BEND_KIND_SIGNATURE) {
        return new BendKindSignatureImpl(node);
      }
      else if (type == BEND_LIST_TYPE) {
        return new BendListTypeImpl(node);
      }
      else if (type == BEND_MODID) {
        return new BendModidImpl(node);
      }
      else if (type == BEND_MODULE_BODY) {
        return new BendModuleBodyImpl(node);
      }
      else if (type == BEND_MODULE_DECLARATION) {
        return new BendModuleDeclarationImpl(node);
      }
      else if (type == BEND_NEWCONSTR) {
        return new BendNewconstrImpl(node);
      }
      else if (type == BEND_NEWCONSTR_FIELDDECL) {
        return new BendNewconstrFielddeclImpl(node);
      }
      else if (type == BEND_NEWTYPE_DECLARATION) {
        return new BendNewtypeDeclarationImpl(node);
      }
      else if (type == BEND_PRAGMA) {
        return new BendPragmaImpl(node);
      }
      else if (type == BEND_QUALIFIER) {
        return new BendQualifierImpl(node);
      }
      else if (type == BEND_QUASI_QUOTE) {
        return new BendQuasiQuoteImpl(node);
      }
      else if (type == BEND_Q_CON) {
        return new BendQConImpl(node);
      }
      else if (type == BEND_Q_CON_QUALIFIER) {
        return new BendQConQualifierImpl(node);
      }
      else if (type == BEND_Q_CON_QUALIFIER_1) {
        return new BendQConQualifier1Impl(node);
      }
      else if (type == BEND_Q_CON_QUALIFIER_2) {
        return new BendQConQualifier2Impl(node);
      }
      else if (type == BEND_Q_CON_QUALIFIER_3) {
        return new BendQConQualifier3Impl(node);
      }
      else if (type == BEND_Q_CON_QUALIFIER_4) {
        return new BendQConQualifier4Impl(node);
      }
      else if (type == BEND_Q_NAME) {
        return new BendQNameImpl(node);
      }
      else if (type == BEND_Q_NAMES) {
        return new BendQNamesImpl(node);
      }
      else if (type == BEND_Q_VAR_CON) {
        return new BendQVarConImpl(node);
      }
      else if (type == BEND_SCONTEXT) {
        return new BendScontextImpl(node);
      }
      else if (type == BEND_SHEBANG_LINE) {
        return new BendShebangLineImpl(node);
      }
      else if (type == BEND_SIMPLECLASS) {
        return new BendSimpleclassImpl(node);
      }
      else if (type == BEND_SIMPLETYPE) {
        return new BendSimpletypeImpl(node);
      }
      else if (type == BEND_TEXT_LITERAL) {
        return new BendTextLiteralImpl(node);
      }
      else if (type == BEND_TOP_DECLARATION) {
        return new BendTopDeclarationImpl(node);
      }
      else if (type == BEND_TTYPE) {
        return new BendTtypeImpl(node);
      }
      else if (type == BEND_TYPE_DECLARATION) {
        return new BendTypeDeclarationImpl(node);
      }
      else if (type == BEND_TYPE_EQUALITY) {
        return new BendTypeEqualityImpl(node);
      }
      else if (type == BEND_TYPE_FAMILY_DECLARATION) {
        return new BendTypeFamilyDeclarationImpl(node);
      }
      else if (type == BEND_TYPE_FAMILY_TYPE) {
        return new BendTypeFamilyTypeImpl(node);
      }
      else if (type == BEND_TYPE_INSTANCE_DECLARATION) {
        return new BendTypeInstanceDeclarationImpl(node);
      }
      else if (type == BEND_TYPE_SIGNATURE) {
        return new BendTypeSignatureImpl(node);
      }
      else if (type == BEND_VARID) {
        return new BendVaridImpl(node);
      }
      else if (type == BEND_VARSYM) {
        return new BendVarsymImpl(node);
      }
      else if (type == BEND_VAR_CON) {
        return new BendVarConImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}

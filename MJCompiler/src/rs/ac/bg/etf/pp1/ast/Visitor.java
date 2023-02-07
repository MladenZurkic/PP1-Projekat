// generated with ast extension for cup
// version 0.8
// 7/1/2023 17:3:27


package rs.ac.bg.etf.pp1.ast;

public interface Visitor { 

    public void visit(ActParsOptional ActParsOptional);
    public void visit(FormParsEnd FormParsEnd);
    public void visit(ExprCommaList ExprCommaList);
    public void visit(CondTermList CondTermList);
    public void visit(ActParsParenOptional ActParsParenOptional);
    public void visit(ClassMethodDeclList ClassMethodDeclList);
    public void visit(VarDeclComma VarDeclComma);
    public void visit(StatementList StatementList);
    public void visit(ClassConstrMethodDecl ClassConstrMethodDecl);
    public void visit(Factor Factor);
    public void visit(CondTerm CondTerm);
    public void visit(AddOpTermList AddOpTermList);
    public void visit(DesignatorCommaList DesignatorCommaList);
    public void visit(MoreVarDecls MoreVarDecls);
    public void visit(Designator Designator);
    public void visit(Term Term);
    public void visit(FormParsList FormParsList);
    public void visit(Condition Condition);
    public void visit(FormParsOptional FormParsOptional);
    public void visit(MulOp MulOp);
    public void visit(DesignatorOptional DesignatorOptional);
    public void visit(RelOp RelOp);
    public void visit(ConstructorDeclList ConstructorDeclList);
    public void visit(VarDeclList VarDeclList);
    public void visit(Expr Expr);
    public void visit(DeclsList DeclsList);
    public void visit(VarDeclEnd VarDeclEnd);
    public void visit(ActPars ActPars);
    public void visit(TypeOrVoid TypeOrVoid);
    public void visit(AddOp AddOp);
    public void visit(DesignatorStatement DesignatorStatement);
    public void visit(NumConstOptional NumConstOptional);
    public void visit(ConstsList ConstsList);
    public void visit(Statement Statement);
    public void visit(FormParsIdent FormParsIdent);
    public void visit(ExprOrActPars ExprOrActPars);
    public void visit(ExtendsOptional ExtendsOptional);
    public void visit(MulOpFactorList MulOpFactorList);
    public void visit(CondFact CondFact);
    public void visit(MethodDeclList MethodDeclList);
    public void visit(ElseStatementOptional ElseStatementOptional);
    public void visit(Decls Decls);
    public void visit(Consts Consts);
    public void visit(GlobalVarDeclList GlobalVarDeclList);
    public void visit(FormPars FormPars);
    public void visit(MulMOD MulMOD);
    public void visit(MulDIV MulDIV);
    public void visit(MulMUL MulMUL);
    public void visit(AddMINUS AddMINUS);
    public void visit(AddPLUS AddPLUS);
    public void visit(RelLEQ RelLEQ);
    public void visit(RelLT RelLT);
    public void visit(RelGEQ RelGEQ);
    public void visit(RelGT RelGT);
    public void visit(RelNEQ RelNEQ);
    public void visit(RelEQ RelEQ);
    public void visit(AssignOp AssignOp);
    public void visit(Label Label);
    public void visit(DesignatorArrayHelp DesignatorArrayHelp);
    public void visit(DesignatorExpr DesignatorExpr);
    public void visit(DesignatorDotIdent DesignatorDotIdent);
    public void visit(DesignatorIdent DesignatorIdent);
    public void visit(ExprOrActParsActPars ExprOrActParsActPars);
    public void visit(ExprOrActParsExpr ExprOrActParsExpr);
    public void visit(NoActParsParen NoActParsParen);
    public void visit(ActParsParenDef ActParsParenDef);
    public void visit(ActParsParen ActParsParen);
    public void visit(DesignatorForActPars DesignatorForActPars);
    public void visit(FactorExpr FactorExpr);
    public void visit(FactorNewActPars FactorNewActPars);
    public void visit(FactorNewExpr FactorNewExpr);
    public void visit(FactorBool FactorBool);
    public void visit(FactorChar FactorChar);
    public void visit(FactorNumber FactorNumber);
    public void visit(FactorDesignatorWithParen FactorDesignatorWithParen);
    public void visit(FactorDesignator FactorDesignator);
    public void visit(NoMulOpFactorList NoMulOpFactorList);
    public void visit(MulOpFactorListDef MulOpFactorListDef);
    public void visit(TermMulFactor TermMulFactor);
    public void visit(TermFactor TermFactor);
    public void visit(NoAddOpTermList NoAddOpTermList);
    public void visit(AddOpTermListDef AddOpTermListDef);
    public void visit(ExprPlusTerm ExprPlusTerm);
    public void visit(ExprTerm ExprTerm);
    public void visit(ExprMinusTerm ExprMinusTerm);
    public void visit(CondFactExprRelOpExpr CondFactExprRelOpExpr);
    public void visit(CondFactExpr CondFactExpr);
    public void visit(CondTermAndCondFact CondTermAndCondFact);
    public void visit(CondTermFact CondTermFact);
    public void visit(NoCondTermList NoCondTermList);
    public void visit(CondTermListDef CondTermListDef);
    public void visit(ConditionORCondTerm ConditionORCondTerm);
    public void visit(ConditionCondTerm ConditionCondTerm);
    public void visit(NoExprCommaList NoExprCommaList);
    public void visit(ExprCommaListDef ExprCommaListDef);
    public void visit(ActParsExprList ActParsExprList);
    public void visit(ActParsExprOnly ActParsExprOnly);
    public void visit(NoDesignatorCommaList NoDesignatorCommaList);
    public void visit(DesignatorCommaListSingle DesignatorCommaListSingle);
    public void visit(DesignatorCommaListDef DesignatorCommaListDef);
    public void visit(NoDesignatorOpt NoDesignatorOpt);
    public void visit(DesignatorOpt DesignatorOpt);
    public void visit(NoActParsOpt NoActParsOpt);
    public void visit(ActParsOpt ActParsOpt);
    public void visit(NoNumConst NoNumConst);
    public void visit(NumConstOpt NumConstOpt);
    public void visit(ElseStmtEpsilon ElseStmtEpsilon);
    public void visit(ElseStmtOpt ElseStmtOpt);
    public void visit(ErrorDesignatorStmtSEMI ErrorDesignatorStmtSEMI);
    public void visit(DesignatorStmtAngleBrack DesignatorStmtAngleBrack);
    public void visit(DesignatorStmtOptDEC DesignatorStmtOptDEC);
    public void visit(DesignatorStmtOptINC DesignatorStmtOptINC);
    public void visit(DesignatorStmtActPars DesignatorStmtActPars);
    public void visit(DesignatorStmtOptAssign DesignatorStmtOptAssign);
    public void visit(EnteredLoop EnteredLoop);
    public void visit(ErrorStmtIFCondition ErrorStmtIFCondition);
    public void visit(StmtList StmtList);
    public void visit(ForEachStmt ForEachStmt);
    public void visit(PrintStmtWithNum PrintStmtWithNum);
    public void visit(PrintStmtNoNum PrintStmtNoNum);
    public void visit(ReadStmt ReadStmt);
    public void visit(ReturnNoExpr ReturnNoExpr);
    public void visit(ReturnExpr ReturnExpr);
    public void visit(ContinueStmt ContinueStmt);
    public void visit(BreakStmt BreakStmt);
    public void visit(WhileStmt WhileStmt);
    public void visit(IfStmt IfStmt);
    public void visit(DesignatorStmt DesignatorStmt);
    public void visit(TypeOrVoidVoid TypeOrVoidVoid);
    public void visit(TypeOrVoidType TypeOrVoidType);
    public void visit(FormParsIdentNoBrackets FormParsIdentNoBrackets);
    public void visit(FormParsIdentWithBrackets FormParsIdentWithBrackets);
    public void visit(ErrorFormParsEndRPAREN ErrorFormParsEndRPAREN);
    public void visit(FormParsEndWithRPAREN FormParsEndWithRPAREN);
    public void visit(ErrorFormParsListCOMMA ErrorFormParsListCOMMA);
    public void visit(FormParsListWithCOMMA FormParsListWithCOMMA);
    public void visit(FormParsListEnd FormParsListEnd);
    public void visit(FormParsWithList FormParsWithList);
    public void visit(NoStatementList NoStatementList);
    public void visit(StatementListDef StatementListDef);
    public void visit(FormParsOptionalRPAREN FormParsOptionalRPAREN);
    public void visit(FormParsOptionalPars FormParsOptionalPars);
    public void visit(MethodTypeName MethodTypeName);
    public void visit(MethodDecl MethodDecl);
    public void visit(ConstructorDecl ConstructorDecl);
    public void visit(ClassMethodDeclListSingle ClassMethodDeclListSingle);
    public void visit(ClassMethodDeclListDef ClassMethodDeclListDef);
    public void visit(ConstructorDeclListSingle ConstructorDeclListSingle);
    public void visit(ConstructorDeclLists ConstructorDeclLists);
    public void visit(NoClassConstrMethodDecl NoClassConstrMethodDecl);
    public void visit(ClassConstrMethodDeclBoth ClassConstrMethodDeclBoth);
    public void visit(ClassConstrMethodDecOnlyMethod ClassConstrMethodDecOnlyMethod);
    public void visit(ClassConstrMethodDeclOnlyConstructor ClassConstrMethodDeclOnlyConstructor);
    public void visit(ClassConstrMethodDeclOnlyBraces ClassConstrMethodDeclOnlyBraces);
    public void visit(NoVarDeclList NoVarDeclList);
    public void visit(VarDeclLists VarDeclLists);
    public void visit(NoExtendsOptional NoExtendsOptional);
    public void visit(ExtendsOptionalDef ExtendsOptionalDef);
    public void visit(ClassDeclName ClassDeclName);
    public void visit(ClassDecl ClassDecl);
    public void visit(NoMoreVarDecls NoMoreVarDecls);
    public void visit(MoreVarDeclsDef MoreVarDeclsDef);
    public void visit(NoAngleBrackets NoAngleBrackets);
    public void visit(AngleBrackets AngleBrackets);
    public void visit(GlobalVarDeclIdent GlobalVarDeclIdent);
    public void visit(VarDeclIdent VarDeclIdent);
    public void visit(ErrorVarDeclEnd ErrorVarDeclEnd);
    public void visit(VarDeclEndDef VarDeclEndDef);
    public void visit(ErrorVarDeclComma ErrorVarDeclComma);
    public void visit(VarDeclCommaDef VarDeclCommaDef);
    public void visit(GlobalVarDeclListEnd GlobalVarDeclListEnd);
    public void visit(GlobalVarDeclLists GlobalVarDeclLists);
    public void visit(GlobalVarDecl GlobalVarDecl);
    public void visit(VarDecl VarDecl);
    public void visit(Type Type);
    public void visit(ConstsListElem ConstsListElem);
    public void visit(ConstsListSingle ConstsListSingle);
    public void visit(ConstsLists ConstsLists);
    public void visit(BoolConst BoolConst);
    public void visit(CharConst CharConst);
    public void visit(NumberConst NumberConst);
    public void visit(ConstDecl ConstDecl);
    public void visit(NoMethodDeclList NoMethodDeclList);
    public void visit(MethodDeclLists MethodDeclLists);
    public void visit(DeclsClassDecl DeclsClassDecl);
    public void visit(DeclsVarDecl DeclsVarDecl);
    public void visit(DeclsConstDecl DeclsConstDecl);
    public void visit(NoDeclarations NoDeclarations);
    public void visit(Declarations Declarations);
    public void visit(ProgName ProgName);
    public void visit(Program Program);

}

// generated with ast extension for cup
// version 0.8
// 23/11/2022 15:42:6


package rs.ac.bg.etf.pp1.ast;

public interface Visitor { 

    public void visit(ActParsOptional ActParsOptional);
    public void visit(ExprOptional ExprOptional);
    public void visit(MethodDecl MethodDecl);
    public void visit(ConstructorDecl ConstructorDecl);
    public void visit(ExprCommaList ExprCommaList);
    public void visit(CondTermList CondTermList);
    public void visit(ActParsParenOptional ActParsParenOptional);
    public void visit(StatementList StatementList);
    public void visit(ActParsParen ActParsParen);
    public void visit(ClassConstrMethodDecl ClassConstrMethodDecl);
    public void visit(Factor Factor);
    public void visit(AddOpTermList AddOpTermList);
    public void visit(CondTerm CondTerm);
    public void visit(CondFactList CondFactList);
    public void visit(DesignatorCommaList DesignatorCommaList);
    public void visit(MoreVarDecls MoreVarDecls);
    public void visit(Designator Designator);
    public void visit(Term Term);
    public void visit(FormParsList FormParsList);
    public void visit(Condition Condition);
    public void visit(ConstMethodSecondPart ConstMethodSecondPart);
    public void visit(FormParsOptional FormParsOptional);
    public void visit(MulOp MulOp);
    public void visit(MethodRest MethodRest);
    public void visit(MinusOptional MinusOptional);
    public void visit(DesignatorOptional DesignatorOptional);
    public void visit(RelOp RelOp);
    public void visit(AssignOp AssignOp);
    public void visit(Label Label);
    public void visit(VarDeclList VarDeclList);
    public void visit(Expr Expr);
    public void visit(DeclsList DeclsList);
    public void visit(ActPars ActPars);
    public void visit(AddOp AddOp);
    public void visit(TypeOrVoid TypeOrVoid);
    public void visit(DesignatorStatement DesignatorStatement);
    public void visit(NumConstOptional NumConstOptional);
    public void visit(ConstsList ConstsList);
    public void visit(Statement Statement);
    public void visit(VarDecl VarDecl);
    public void visit(AngleBrackets AngleBrackets);
    public void visit(DesignatorStatementOptional DesignatorStatementOptional);
    public void visit(ConstrMethodBothOptional ConstrMethodBothOptional);
    public void visit(Type Type);
    public void visit(ExprOrActPars ExprOrActPars);
    public void visit(ClassDecl ClassDecl);
    public void visit(ConstDecl ConstDecl);
    public void visit(MulOpFactorList MulOpFactorList);
    public void visit(CondFact CondFact);
    public void visit(ExtendsOptional ExtendsOptional);
    public void visit(MethodDeclList MethodDeclList);
    public void visit(RelOpExprOptional RelOpExprOptional);
    public void visit(ElseStatementOptional ElseStatementOptional);
    public void visit(Decls Decls);
    public void visit(Consts Consts);
    public void visit(FormPars FormPars);
    public void visit(MulOpDerived3 MulOpDerived3);
    public void visit(MulOpDerived2 MulOpDerived2);
    public void visit(MulOpDerived1 MulOpDerived1);
    public void visit(AddOpDerived2 AddOpDerived2);
    public void visit(AddOpDerived1 AddOpDerived1);
    public void visit(RelOpDerived6 RelOpDerived6);
    public void visit(RelOpDerived5 RelOpDerived5);
    public void visit(RelOpDerived4 RelOpDerived4);
    public void visit(RelOpDerived3 RelOpDerived3);
    public void visit(RelOpDerived2 RelOpDerived2);
    public void visit(RelOpDerived1 RelOpDerived1);
    public void visit(AssignOpDerived1 AssignOpDerived1);
    public void visit(LabelDerived1 LabelDerived1);
    public void visit(DesignatorDerived3 DesignatorDerived3);
    public void visit(DesignatorDerived2 DesignatorDerived2);
    public void visit(DesignatorDerived1 DesignatorDerived1);
    public void visit(ExprOrActParsDerived2 ExprOrActParsDerived2);
    public void visit(ExprOrActParsDerived1 ExprOrActParsDerived1);
    public void visit(ActParsParenOptionalDerived2 ActParsParenOptionalDerived2);
    public void visit(ActParsParenOptionalDerived1 ActParsParenOptionalDerived1);
    public void visit(ActParsParenDerived1 ActParsParenDerived1);
    public void visit(FactorDerived6 FactorDerived6);
    public void visit(FactorDerived5 FactorDerived5);
    public void visit(FactorDerived4 FactorDerived4);
    public void visit(FactorDerived3 FactorDerived3);
    public void visit(FactorDerived2 FactorDerived2);
    public void visit(FactorDerived1 FactorDerived1);
    public void visit(MulOpFactorListDerived2 MulOpFactorListDerived2);
    public void visit(MulOpFactorListDerived1 MulOpFactorListDerived1);
    public void visit(TermDerived1 TermDerived1);
    public void visit(AddOpTermListDerived2 AddOpTermListDerived2);
    public void visit(AddOpTermListDerived1 AddOpTermListDerived1);
    public void visit(MinusOptionalDerived2 MinusOptionalDerived2);
    public void visit(MinusOptionalDerived1 MinusOptionalDerived1);
    public void visit(ExprDerived1 ExprDerived1);
    public void visit(RelOpExprOptionalDerived2 RelOpExprOptionalDerived2);
    public void visit(RelOpExprOptionalDerived1 RelOpExprOptionalDerived1);
    public void visit(CondFactDerived1 CondFactDerived1);
    public void visit(CondFactListDerived2 CondFactListDerived2);
    public void visit(CondFactListDerived1 CondFactListDerived1);
    public void visit(CondTermDerived1 CondTermDerived1);
    public void visit(CondTermListDerived2 CondTermListDerived2);
    public void visit(CondTermListDerived1 CondTermListDerived1);
    public void visit(ConditionDerived1 ConditionDerived1);
    public void visit(ExprCommaListDerived2 ExprCommaListDerived2);
    public void visit(ExprCommaListDerived1 ExprCommaListDerived1);
    public void visit(ActParsDerived1 ActParsDerived1);
    public void visit(DesignatorCommaListDerived2 DesignatorCommaListDerived2);
    public void visit(DesignatorCommaListDerived1 DesignatorCommaListDerived1);
    public void visit(DesignatorOptionalDerived2 DesignatorOptionalDerived2);
    public void visit(DesignatorOptionalDerived1 DesignatorOptionalDerived1);
    public void visit(ActParsOptionalDerived2 ActParsOptionalDerived2);
    public void visit(ActParsOptionalDerived1 ActParsOptionalDerived1);
    public void visit(DesignatorStatementOptionalDerived4 DesignatorStatementOptionalDerived4);
    public void visit(DesignatorStatementOptionalDerived3 DesignatorStatementOptionalDerived3);
    public void visit(DesignatorStatementOptionalDerived2 DesignatorStatementOptionalDerived2);
    public void visit(DesignatorStatementOptionalDerived1 DesignatorStatementOptionalDerived1);
    public void visit(NumConstOptionalDerived2 NumConstOptionalDerived2);
    public void visit(NumConstOptionalDerived1 NumConstOptionalDerived1);
    public void visit(ExprOptionalDerived2 ExprOptionalDerived2);
    public void visit(ExprOptionalDerived1 ExprOptionalDerived1);
    public void visit(ElseStatementOptionalDerived2 ElseStatementOptionalDerived2);
    public void visit(ElseStatementOptionalDerived1 ElseStatementOptionalDerived1);
    public void visit(DesignatorStatementDerived2 DesignatorStatementDerived2);
    public void visit(DesignatorStatementDerived1 DesignatorStatementDerived1);
    public void visit(StatementDerived10 StatementDerived10);
    public void visit(StatementDerived9 StatementDerived9);
    public void visit(StatementDerived8 StatementDerived8);
    public void visit(StatementDerived7 StatementDerived7);
    public void visit(StatementDerived6 StatementDerived6);
    public void visit(StatementDerived5 StatementDerived5);
    public void visit(StatementDerived4 StatementDerived4);
    public void visit(StatementDerived3 StatementDerived3);
    public void visit(StatementDerived2 StatementDerived2);
    public void visit(StatementDerived1 StatementDerived1);
    public void visit(TypeOrVoidDerived2 TypeOrVoidDerived2);
    public void visit(TypeOrVoidDerived1 TypeOrVoidDerived1);
    public void visit(MethodDeclDerived1 MethodDeclDerived1);
    public void visit(FormParsListDerived2 FormParsListDerived2);
    public void visit(FormParsListDerived1 FormParsListDerived1);
    public void visit(FormParsDerived1 FormParsDerived1);
    public void visit(StatementListDerived2 StatementListDerived2);
    public void visit(StatementListDerived1 StatementListDerived1);
    public void visit(FormParsOptionalDerived2 FormParsOptionalDerived2);
    public void visit(FormParsOptionalDerived1 FormParsOptionalDerived1);
    public void visit(ConstructorDeclDerived1 ConstructorDeclDerived1);
    public void visit(MethodRestDerived3 MethodRestDerived3);
    public void visit(MethodRestDerived2 MethodRestDerived2);
    public void visit(MethodRestDerived1 MethodRestDerived1);
    public void visit(ConstMethodSecondPartDerived1 ConstMethodSecondPartDerived1);
    public void visit(ConstrMethodBothOptionalDerived4 ConstrMethodBothOptionalDerived4);
    public void visit(ConstrMethodBothOptionalDerived3 ConstrMethodBothOptionalDerived3);
    public void visit(ConstrMethodBothOptionalDerived2 ConstrMethodBothOptionalDerived2);
    public void visit(ConstrMethodBothOptionalDerived1 ConstrMethodBothOptionalDerived1);
    public void visit(ClassConstrMethodDeclDerived2 ClassConstrMethodDeclDerived2);
    public void visit(ClassConstrMethodDeclDerived1 ClassConstrMethodDeclDerived1);
    public void visit(VarDeclListDerived2 VarDeclListDerived2);
    public void visit(VarDeclListDerived1 VarDeclListDerived1);
    public void visit(ExtendsOptionalDerived2 ExtendsOptionalDerived2);
    public void visit(ExtendsOptionalDerived1 ExtendsOptionalDerived1);
    public void visit(ClassDeclDerived1 ClassDeclDerived1);
    public void visit(MoreVarDeclsDerived2 MoreVarDeclsDerived2);
    public void visit(MoreVarDeclsDerived1 MoreVarDeclsDerived1);
    public void visit(AngleBracketsDerived2 AngleBracketsDerived2);
    public void visit(AngleBracketsDerived1 AngleBracketsDerived1);
    public void visit(VarDeclDerived1 VarDeclDerived1);
    public void visit(TypeDerived1 TypeDerived1);
    public void visit(ConstsListDerived2 ConstsListDerived2);
    public void visit(ConstsListDerived1 ConstsListDerived1);
    public void visit(ConstsDerived3 ConstsDerived3);
    public void visit(ConstsDerived2 ConstsDerived2);
    public void visit(ConstsDerived1 ConstsDerived1);
    public void visit(ConstDeclDerived1 ConstDeclDerived1);
    public void visit(MethodDeclListDerived2 MethodDeclListDerived2);
    public void visit(MethodDeclListDerived1 MethodDeclListDerived1);
    public void visit(DeclsClassDecl DeclsClassDecl);
    public void visit(DeclsVarDecl DeclsVarDecl);
    public void visit(DeclsConstDecl DeclsConstDecl);
    public void visit(NoVarDecl NoVarDecl);
    public void visit(Declarations Declarations);
    public void visit(Program Program);

}

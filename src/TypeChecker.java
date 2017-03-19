public class TypeChecker extends DutchJavaBaseVisitor {

    private Scope scope = new Scope();

    @Override
    public Scope.Type visitAls_statement(DutchJavaParser.Als_statementContext ctx) {
        if(!(visit(ctx.cond_block) == Scope.Type.BOOL)){
            throw new IllegalArgumentException("if statement invalid");
        }
        return null;
    }

    @Override
    public Scope.Type visitZolang_statement(DutchJavaParser.Zolang_statementContext ctx) {
        if(visit(ctx.expressie()) == Scope.Type.BOOL) {
            return null;
        }
        throw new IllegalArgumentException("while must have a boolean");
    }

    @Override
    public Scope.Type visitToekenning(DutchJavaParser.ToekenningContext ctx) {
        if(ctx.DATATYPE().getText().equals("nummer") && this.checkIfVariableExists(ctx.ID().getText())) {
            scope.addVar(new Variable(ctx.ID().getText(), Scope.Type.INT, ctx.expressie().getText()));
            return null;
        }
        else if(ctx.DATATYPE().getText().equals("draad") && this.checkIfVariableExists(ctx.ID().getText())){
            scope.addVar(new Variable(ctx.ID().getText(), Scope.Type.STRING, ctx.expressie().getText()));
            return null;
        }
        else if(ctx.DATATYPE().getText().equals("lang") && this.checkIfVariableExists(ctx.ID().getText())){
            scope.addVar(new Variable(ctx.ID().getText(), Scope.Type.LONG, ctx.expressie().getText()));
            return null;
        }
        else if(ctx.DATATYPE().getText().equals("booleaans") && this.checkIfVariableExists(ctx.ID().getText())){
            scope.addVar(new Variable(ctx.ID().getText(), Scope.Type.BOOL, ctx.expressie().getText()));
            return null;
        }
        else if(ctx.DATATYPE().getText().equals("leegte") && this.checkIfVariableExists(ctx.ID().getText())){
            throw new IllegalArgumentException("leegte is not a valid type for variable declaration");
        }

        throw new IllegalArgumentException("Is not a valid type");
    }

    @Override
    public Object visitConditie_block(DutchJavaParser.Conditie_blockContext ctx) {
        if(visit(ctx.expressie()) == Scope.Type.BOOL){
            return null;
        }
        throw new IllegalArgumentException("Condition does not result in a boolean");
    }

    @Override
    public Object visitMethodeUITVOERING(DutchJavaParser.MethodeUITVOERINGContext ctx) {
        if(this.checkIfMethodExists(ctx.ID().getText())){
            throw new IllegalArgumentException("Method already rexists");
        } else {
            scope.addMethod(ctx.ID().getText());
            return null;
        }
    }

    @Override
    public Object visitMethodeAANROEP(DutchJavaParser.MethodeAANROEPContext ctx) {
        if(!this.checkIfMethodExists(ctx.ID().getText())){
            throw new IllegalArgumentException("Method doesn't exist");
        }
        return null;
    }

    /**
     * Logische expressies
     */
    @Override
    public Scope.Type visitNietExpr(DutchJavaParser.NietExprContext ctx) {
        if (visit(ctx.expressie()) == Scope.Type.BOOL) {
            return Scope.Type.BOOL;
        }
        throw new IllegalArgumentException("Is not boolean");
    }

    @Override
    public Scope.Type visitVergelijkingExpr(DutchJavaParser.VergelijkingExprContext ctx) {
        if(visit(ctx.leftExpr) == Scope.Type.BOOL && visit(ctx.rightExpr) == Scope.Type.BOOL){
            return Scope.Type.BOOL;
        }
        throw new IllegalArgumentException("Is not boolean");
    }

    @Override
    public Object visitGelijkheidExpr(DutchJavaParser.GelijkheidExprContext ctx) {
        if(visit(ctx.leftExpr) == Scope.Type.BOOL && visit(ctx.rightExpr) == Scope.Type.BOOL){
            return Scope.Type.BOOL;
        }
        throw new IllegalArgumentException("Is not boolean");
    }

    @Override
    public Scope.Type visitEnenExpr(DutchJavaParser.EnenExprContext ctx) {
        if (visit(ctx.leftExpr) == Scope.Type.BOOL && visit(ctx.rightExpr) == Scope.Type.BOOL) {
            return Scope.Type.BOOL;
        }
        throw new IllegalArgumentException("Is not boolean");

    }

    @Override
    public Object visitPlusMinExpr(DutchJavaParser.PlusMinExprContext ctx) {
        if((ctx.op.getText().equals("+") || ctx.op.getText().equals("-"))
                && visit(ctx.leftExpr) == Scope.Type.INT && visit(ctx.rightExpr) == Scope.Type.INT){
            return null;
        } else {
            throw new IllegalArgumentException("Unsupported expression");
        }
    }

    @Override
    public Object visitOfofExpr(DutchJavaParser.OfofExprContext ctx) {
        if (visit(ctx.leftExpr) == Scope.Type.BOOL && visit(ctx.rightExpr) == Scope.Type.BOOL) {
            return Scope.Type.BOOL;
        }
        throw new IllegalArgumentException("Is not boolean");
    }

    /**
     * Check if a var is in scope
     * @param id id of var
     * @return boolean
     */
    private boolean checkIfVariableExists(String id){
        for (Variable var : scope.getVars()){
            if(var.getName().equals(id)){
                return true;
            }
        }
        return false;
    }

    /**
     * Check if a method is in scope
     * @param id id of method
     * @return boolean
     */
    private boolean checkIfMethodExists(String id){
        for (String scopeId: scope.getMethods()){
            if(scopeId.equals(id)){
                return true;
            }
        }
        return false;
    }
}

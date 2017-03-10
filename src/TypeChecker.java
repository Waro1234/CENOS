/**
 * Created by sklar on 2/17/2017.
 */
public class TypeChecker extends DutchJavaBaseVisitor {

    private Scope scope = new Scope();

    @Override
    public Scope.Type visitAls_statement(DutchJavaParser.Als_statementContext ctx) {
        throw new IllegalArgumentException("if statement invalid");
    }

    @Override
    public Scope.Type visitToekenning(DutchJavaParser.ToekenningContext ctx) {
        if(ctx.DATATYPE().getText().equals("nummer")) {
            scope.addVar(new Variable(ctx.ID().getText(), Scope.Type.INT, ctx.expressie().getText()));
            return null;
        }
        else if(ctx.DATATYPE().getText().equals("draad")){
            scope.addVar(new Variable(ctx.ID().getText(), Scope.Type.STRING, ctx.expressie().getText()));
            return null;
        }
        else if(ctx.DATATYPE().getText().equals("lang")){
            scope.addVar(new Variable(ctx.ID().getText(), Scope.Type.LONG, ctx.expressie().getText()));
            return null;
        }
        else if(ctx.DATATYPE().getText().equals("booleaans")){
            scope.addVar(new Variable(ctx.ID().getText(), Scope.Type.BOOL, ctx.expressie().getText()));
            return null;
        }
        else if(ctx.DATATYPE().getText().equals("leegte")){
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
    public Object visitOfofExpr(DutchJavaParser.OfofExprContext ctx) {
        if (visit(ctx.leftExpr) == Scope.Type.BOOL && visit(ctx.rightExpr) == Scope.Type.BOOL) {
            return Scope.Type.BOOL;
        }
        throw new IllegalArgumentException("Is not boolean");
    }
}

/**
 * Created by sklar on 2/17/2017.
 */
public class TypeChecker extends DutchJavaBaseVisitor {
    private enum Type {
        BOOL,
        INT,
        STRING,
        EXCEPTION;
    }

    public TypeChecker() {
    }

    @Override
    public Object visitExpressieStatement(DutchJavaParser.ExpressieStatementContext ctx) {
        return super.visitExpressieStatement(ctx);
    }

    @Override
    public Object visitConditie_block(DutchJavaParser.Conditie_blockContext ctx) {
        //ctx.expr.
        return super.visitConditie_block(ctx);
    }

    /**
     * Logische expressies
     */
    @Override
    public Type visitNietExpr(DutchJavaParser.NietExprContext ctx) {
        // return super.visitNietExpr(ctx);
        if (visit(ctx.expressie()) == Type.BOOL) {

        }
        return Type.BOOL;
    }

    @Override
    public Type visitVergelijkingExpr(DutchJavaParser.VergelijkingExprContext ctx) {
        ctx.leftExpr;
        ctx.rightExpr;
        return Type.EXCEPTION;
    }

    @Override
    public Object visitGelijkheidExpr(DutchJavaParser.GelijkheidExprContext ctx) {
        return super.visitGelijkheidExpr(ctx);
    }

    @Override
    public Type visitEnenExpr(DutchJavaParser.EnenExprContext ctx) {
        if (visit(ctx.leftExpr) == Type.BOOL && visit(ctx.rightExpr) == Type.BOOL) {
            return Type.BOOL;
        } else {
            try {
                throw new Exception("Error, expected bool");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return Type.EXCEPTION;
    }

    @Override
    public Object visitOfofExpr(DutchJavaParser.OfofExprContext ctx) {
        if (visit(ctx.leftExpr) == Type.BOOL && visit(ctx.rightExpr) == Type.BOOL) {
            return Type.BOOL;
        } else {
            try {
                throw new Exception("Error, expected bool");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return Type.EXCEPTION;
    }
}

import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Created by sklar on 2/17/2017.
 */
public class TypeChecker extends DutchJavaBaseVisitor{
    public TypeChecker() {
    }

    @Override
    public Object visitAlsStatement(DutchJavaParser.AlsStatementContext ctx) {
        return super.visitAlsStatement(ctx);
    }

    @Override
    public Object visitVoorStatement(DutchJavaParser.VoorStatementContext ctx) {
        return super.visitVoorStatement(ctx);
    }

    @Override
    public Object visitVoorAlleStatement(DutchJavaParser.VoorAlleStatementContext ctx) {
        return super.visitVoorAlleStatement(ctx);
    }

    @Override
    public Object visitZolangStatement(DutchJavaParser.ZolangStatementContext ctx) {
        return super.visitZolangStatement(ctx);
    }

    @Override
    public Object visitMethodeUitvoeringStatement(DutchJavaParser.MethodeUitvoeringStatementContext ctx) {
        return super.visitMethodeUitvoeringStatement(ctx);
    }

    @Override
    public Object visitMethodeAanroepStatement(DutchJavaParser.MethodeAanroepStatementContext ctx) {
        return super.visitMethodeAanroepStatement(ctx);
    }

    @Override
    public Object visitToekenningStatement(DutchJavaParser.ToekenningStatementContext ctx) {
        return super.visitToekenningStatement(ctx);
    }

    @Override
    public Object visitExpressieStatement(DutchJavaParser.ExpressieStatementContext ctx) {
        return super.visitExpressieStatement(ctx);
    }

    @Override
    public Object visitAls_statement(DutchJavaParser.Als_statementContext ctx) {
        return super.visitAls_statement(ctx);
    }

    @Override
    public Object visitZolang_statement(DutchJavaParser.Zolang_statementContext ctx) {
        return super.visitZolang_statement(ctx);
    }

    @Override
    public Object visitVoor_statement(DutchJavaParser.Voor_statementContext ctx) {
        return super.visitVoor_statement(ctx);
    }

    @Override
    public Object visitVoor_blok(DutchJavaParser.Voor_blokContext ctx) {
        return super.visitVoor_blok(ctx);
    }

    @Override
    public Object visitConditie_block(DutchJavaParser.Conditie_blockContext ctx) {
        ctx.expr.
        return super.visitConditie_block(ctx);
    }

    /**
     * Logische expressies
     */
    @Override
    public Boolean visitNietExpr(DutchJavaParser.NietExprContext ctx) {
       // return super.visitNietExpr(ctx);
    }

    @Override
    public Boolean visitVergelijkingExpr(DutchJavaParser.VergelijkingExprContext ctx) {
     //   return super.visitVergelijkingExpr(ctx);
    }

    @Override
    public Boolean visitOfofExpr(DutchJavaParser.OfofExprContext ctx) {
       // return super.visitOfofExpr(ctx);
    }

    @Override
    public Boolean visitGelijkheidExpr(DutchJavaParser.GelijkheidExprContext ctx) {
       // return super.visitGelijkheidExpr(ctx);
    }

    @Override
    public Boolean visitEnenExpr(DutchJavaParser.EnenExprContext ctx) {
        return true;
    }
}

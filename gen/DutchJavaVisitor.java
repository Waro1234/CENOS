// Generated from /Volumes/Opslag/School/Leerjaar 2 Kwartiel 3/Compilers en operatingsystems/Git/DutchJava.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DutchJavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DutchJavaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DutchJavaParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(DutchJavaParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DutchJavaParser#blok}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlok(DutchJavaParser.BlokContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alsStatement}
	 * labeled alternative in {@link DutchJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlsStatement(DutchJavaParser.AlsStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code voorStatement}
	 * labeled alternative in {@link DutchJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoorStatement(DutchJavaParser.VoorStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code voorAlleStatement}
	 * labeled alternative in {@link DutchJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoorAlleStatement(DutchJavaParser.VoorAlleStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code zolangStatement}
	 * labeled alternative in {@link DutchJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZolangStatement(DutchJavaParser.ZolangStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodeUitvoeringStatement}
	 * labeled alternative in {@link DutchJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodeUitvoeringStatement(DutchJavaParser.MethodeUitvoeringStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodeAanroepStatement}
	 * labeled alternative in {@link DutchJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodeAanroepStatement(DutchJavaParser.MethodeAanroepStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code toekenningStatement}
	 * labeled alternative in {@link DutchJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToekenningStatement(DutchJavaParser.ToekenningStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressieStatement}
	 * labeled alternative in {@link DutchJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressieStatement(DutchJavaParser.ExpressieStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DutchJavaParser#als_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAls_statement(DutchJavaParser.Als_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DutchJavaParser#zolang_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZolang_statement(DutchJavaParser.Zolang_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DutchJavaParser#voor_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoor_statement(DutchJavaParser.Voor_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DutchJavaParser#voor_blok}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoor_blok(DutchJavaParser.Voor_blokContext ctx);
	/**
	 * Visit a parse tree produced by {@link DutchJavaParser#toekenning}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToekenning(DutchJavaParser.ToekenningContext ctx);
	/**
	 * Visit a parse tree produced by {@link DutchJavaParser#conditie_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditie_block(DutchJavaParser.Conditie_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DutchJavaParser#stat_blok}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_blok(DutchJavaParser.Stat_blokContext ctx);
	/**
	 * Visit a parse tree produced by {@link DutchJavaParser#methodeAANROEP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodeAANROEP(DutchJavaParser.MethodeAANROEPContext ctx);
	/**
	 * Visit a parse tree produced by {@link DutchJavaParser#methodeUITVOERING}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodeUITVOERING(DutchJavaParser.MethodeUITVOERINGContext ctx);
	/**
	 * Visit a parse tree produced by {@link DutchJavaParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(DutchJavaParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DutchJavaParser#argument_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_type(DutchJavaParser.Argument_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DutchJavaParser#vooralle_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVooralle_statement(DutchJavaParser.Vooralle_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vooralleBlokExpr}
	 * labeled alternative in {@link DutchJavaParser#vooralle_blok}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVooralleBlokExpr(DutchJavaParser.VooralleBlokExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nietExpr}
	 * labeled alternative in {@link DutchJavaParser#expressie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNietExpr(DutchJavaParser.NietExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vergelijkingExpr}
	 * labeled alternative in {@link DutchJavaParser#expressie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVergelijkingExpr(DutchJavaParser.VergelijkingExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ofofExpr}
	 * labeled alternative in {@link DutchJavaParser#expressie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOfofExpr(DutchJavaParser.OfofExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code gelijkheidExpr}
	 * labeled alternative in {@link DutchJavaParser#expressie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGelijkheidExpr(DutchJavaParser.GelijkheidExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code enenExpr}
	 * labeled alternative in {@link DutchJavaParser#expressie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnenExpr(DutchJavaParser.EnenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minusExpr}
	 * labeled alternative in {@link DutchJavaParser#expressie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusExpr(DutchJavaParser.MinusExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomCondExpr}
	 * labeled alternative in {@link DutchJavaParser#expressie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomCondExpr(DutchJavaParser.AtomCondExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code keerGddModExpr}
	 * labeled alternative in {@link DutchJavaParser#value_expressie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeerGddModExpr(DutchJavaParser.KeerGddModExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minminPlusPlusExpr}
	 * labeled alternative in {@link DutchJavaParser#value_expressie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinminPlusPlusExpr(DutchJavaParser.MinminPlusPlusExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isRekenExpr}
	 * labeled alternative in {@link DutchJavaParser#value_expressie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsRekenExpr(DutchJavaParser.IsRekenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusMinExpr}
	 * labeled alternative in {@link DutchJavaParser#value_expressie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMinExpr(DutchJavaParser.PlusMinExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomValueExpr}
	 * labeled alternative in {@link DutchJavaParser#value_expressie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomValueExpr(DutchJavaParser.AtomValueExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DutchJavaParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(DutchJavaParser.AtomContext ctx);
}
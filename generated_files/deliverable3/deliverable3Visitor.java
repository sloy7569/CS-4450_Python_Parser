// Generated from deliverable3.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link deliverable3Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface deliverable3Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link deliverable3Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(deliverable3Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link deliverable3Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(deliverable3Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link deliverable3Parser#ifstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstatement(deliverable3Parser.IfstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link deliverable3Parser#whilestatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilestatement(deliverable3Parser.WhilestatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link deliverable3Parser#forstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForstatement(deliverable3Parser.ForstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link deliverable3Parser#rangeexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeexpr(deliverable3Parser.RangeexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link deliverable3Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(deliverable3Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link deliverable3Parser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(deliverable3Parser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link deliverable3Parser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(deliverable3Parser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link deliverable3Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(deliverable3Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link deliverable3Parser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(deliverable3Parser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link deliverable3Parser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(deliverable3Parser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link deliverable3Parser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(deliverable3Parser.ComparisonOperatorContext ctx);
}
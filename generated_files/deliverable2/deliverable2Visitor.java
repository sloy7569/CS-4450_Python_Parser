// Generated from deliverable2.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link deliverable2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface deliverable2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link deliverable2Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(deliverable2Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link deliverable2Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(deliverable2Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link deliverable2Parser#ifstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstatement(deliverable2Parser.IfstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link deliverable2Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(deliverable2Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link deliverable2Parser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(deliverable2Parser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link deliverable2Parser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(deliverable2Parser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link deliverable2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(deliverable2Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link deliverable2Parser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(deliverable2Parser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link deliverable2Parser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(deliverable2Parser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link deliverable2Parser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(deliverable2Parser.ComparisonOperatorContext ctx);
}
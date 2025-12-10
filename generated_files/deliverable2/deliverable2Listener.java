// Generated from deliverable2.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link deliverable2Parser}.
 */
public interface deliverable2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link deliverable2Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(deliverable2Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link deliverable2Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(deliverable2Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link deliverable2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(deliverable2Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link deliverable2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(deliverable2Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link deliverable2Parser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void enterIfstatement(deliverable2Parser.IfstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link deliverable2Parser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void exitIfstatement(deliverable2Parser.IfstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link deliverable2Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(deliverable2Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link deliverable2Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(deliverable2Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link deliverable2Parser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(deliverable2Parser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link deliverable2Parser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(deliverable2Parser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link deliverable2Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(deliverable2Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link deliverable2Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(deliverable2Parser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link deliverable2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(deliverable2Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link deliverable2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(deliverable2Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link deliverable2Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(deliverable2Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link deliverable2Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(deliverable2Parser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link deliverable2Parser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(deliverable2Parser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link deliverable2Parser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(deliverable2Parser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link deliverable2Parser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(deliverable2Parser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link deliverable2Parser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(deliverable2Parser.ComparisonOperatorContext ctx);
}
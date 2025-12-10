// Generated from deliverable3.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link deliverable3Parser}.
 */
public interface deliverable3Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link deliverable3Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(deliverable3Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link deliverable3Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(deliverable3Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link deliverable3Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(deliverable3Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link deliverable3Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(deliverable3Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link deliverable3Parser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void enterIfstatement(deliverable3Parser.IfstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link deliverable3Parser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void exitIfstatement(deliverable3Parser.IfstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link deliverable3Parser#whilestatement}.
	 * @param ctx the parse tree
	 */
	void enterWhilestatement(deliverable3Parser.WhilestatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link deliverable3Parser#whilestatement}.
	 * @param ctx the parse tree
	 */
	void exitWhilestatement(deliverable3Parser.WhilestatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link deliverable3Parser#forstatement}.
	 * @param ctx the parse tree
	 */
	void enterForstatement(deliverable3Parser.ForstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link deliverable3Parser#forstatement}.
	 * @param ctx the parse tree
	 */
	void exitForstatement(deliverable3Parser.ForstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link deliverable3Parser#rangeexpr}.
	 * @param ctx the parse tree
	 */
	void enterRangeexpr(deliverable3Parser.RangeexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link deliverable3Parser#rangeexpr}.
	 * @param ctx the parse tree
	 */
	void exitRangeexpr(deliverable3Parser.RangeexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link deliverable3Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(deliverable3Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link deliverable3Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(deliverable3Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link deliverable3Parser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(deliverable3Parser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link deliverable3Parser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(deliverable3Parser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link deliverable3Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(deliverable3Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link deliverable3Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(deliverable3Parser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link deliverable3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(deliverable3Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link deliverable3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(deliverable3Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link deliverable3Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(deliverable3Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link deliverable3Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(deliverable3Parser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link deliverable3Parser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(deliverable3Parser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link deliverable3Parser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(deliverable3Parser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link deliverable3Parser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(deliverable3Parser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link deliverable3Parser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(deliverable3Parser.ComparisonOperatorContext ctx);
}
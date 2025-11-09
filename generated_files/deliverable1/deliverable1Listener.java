// Generated from deliverable1.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link deliverable1Parser}.
 */
public interface deliverable1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link deliverable1Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(deliverable1Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link deliverable1Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(deliverable1Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link deliverable1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(deliverable1Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link deliverable1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(deliverable1Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link deliverable1Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(deliverable1Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link deliverable1Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(deliverable1Parser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link deliverable1Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(deliverable1Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link deliverable1Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(deliverable1Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link deliverable1Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(deliverable1Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link deliverable1Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(deliverable1Parser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link deliverable1Parser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(deliverable1Parser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link deliverable1Parser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(deliverable1Parser.ArrayContext ctx);
}
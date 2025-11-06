// Generated from deliverable1.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link deliverable1Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface deliverable1Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link deliverable1Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(deliverable1Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link deliverable1Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(deliverable1Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link deliverable1Parser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(deliverable1Parser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link deliverable1Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(deliverable1Parser.ExpressionContext ctx);
}
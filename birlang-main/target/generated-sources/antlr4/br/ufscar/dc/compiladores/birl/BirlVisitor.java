// Generated from br\u005Cufscar\dc\compiladores\birl\Birl.g4 by ANTLR 4.9.2
package br.ufscar.dc.compiladores.birl;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BirlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BirlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BirlParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(BirlParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link BirlParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(BirlParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link BirlParser#info}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfo(BirlParser.InfoContext ctx);
	/**
	 * Visit a parse tree produced by {@link BirlParser#bloco_daily}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco_daily(BirlParser.Bloco_dailyContext ctx);
	/**
	 * Visit a parse tree produced by {@link BirlParser#daily}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDaily(BirlParser.DailyContext ctx);
}
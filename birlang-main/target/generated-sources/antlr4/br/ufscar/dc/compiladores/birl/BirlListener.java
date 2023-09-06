// Generated from br\u005Cufscar\dc\compiladores\birl\Birl.g4 by ANTLR 4.9.2
package br.ufscar.dc.compiladores.birl;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BirlParser}.
 */
public interface BirlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BirlParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(BirlParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link BirlParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(BirlParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link BirlParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(BirlParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link BirlParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(BirlParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link BirlParser#info}.
	 * @param ctx the parse tree
	 */
	void enterInfo(BirlParser.InfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BirlParser#info}.
	 * @param ctx the parse tree
	 */
	void exitInfo(BirlParser.InfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link BirlParser#bloco_daily}.
	 * @param ctx the parse tree
	 */
	void enterBloco_daily(BirlParser.Bloco_dailyContext ctx);
	/**
	 * Exit a parse tree produced by {@link BirlParser#bloco_daily}.
	 * @param ctx the parse tree
	 */
	void exitBloco_daily(BirlParser.Bloco_dailyContext ctx);
	/**
	 * Enter a parse tree produced by {@link BirlParser#daily}.
	 * @param ctx the parse tree
	 */
	void enterDaily(BirlParser.DailyContext ctx);
	/**
	 * Exit a parse tree produced by {@link BirlParser#daily}.
	 * @param ctx the parse tree
	 */
	void exitDaily(BirlParser.DailyContext ctx);
}
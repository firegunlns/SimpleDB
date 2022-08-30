// Generated from C:/work/learn/java/SimpleDB/src/main/java/com/lns/SimpleDB\CalcExpr.g4 by ANTLR 4.10.1
package com.lns.SimpleDB.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalcExprParser}.
 */
public interface CalcExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalcExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(CalcExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(CalcExprParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link CalcExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(CalcExprParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link CalcExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(CalcExprParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link CalcExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(CalcExprParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link CalcExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(CalcExprParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link CalcExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(CalcExprParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link CalcExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(CalcExprParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link CalcExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(CalcExprParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link CalcExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(CalcExprParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link CalcExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(CalcExprParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link CalcExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(CalcExprParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link CalcExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(CalcExprParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link CalcExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(CalcExprParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link CalcExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(CalcExprParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link CalcExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(CalcExprParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link CalcExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(CalcExprParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link CalcExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(CalcExprParser.IntContext ctx);
}
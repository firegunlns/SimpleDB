package com.lns.SimpleDB;

import com.lns.SimpleDB.gen.CalcExprBaseVisitor;
import com.lns.SimpleDB.gen.CalcExprParser;
import com.lns.SimpleDB.gen.CalcExprVisitor;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;

public class MyCalcExprVisitor extends CalcExprBaseVisitor<Object> {
    HashMap<String, Integer> varlst;

    public MyCalcExprVisitor(HashMap<String, Integer> varlst){
        this.varlst = varlst;
    }

    @Override
    public Object visitProg(CalcExprParser.ProgContext ctx) {
        for (CalcExprParser.StatContext x : ctx.stat())
            visit(x);

        return null;
    }

    @Override
    public Object visitPrintExpr(CalcExprParser.PrintExprContext ctx) {
        Object val = visit(ctx.expr());
        //System.out.printf("val is:%d\n", val);
        return null;
    }

    @Override
    public Object visitAssign(CalcExprParser.AssignContext ctx) {
        String id = (String)visit(ctx.ID());
        Integer val = (Integer) visit(ctx.expr());

        varlst.put(id, val);
        return null;
    }

    @Override
    public Object visitBlank(CalcExprParser.BlankContext ctx) {
        return null;
    }

    @Override
    public Object visitParens(CalcExprParser.ParensContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Object visitMulDiv(CalcExprParser.MulDivContext ctx) {
        Object left =  visit(ctx.expr(0));
        Integer leftVal = left instanceof Integer ? (Integer) left : varlst.get(left);
        Integer right = (Integer) visit(ctx.expr(1));
        Integer rightVal = right instanceof Integer ? (Integer) right : varlst.get(right);

        if (ctx.op.getType() == CalcExprParser.MUL)
            return leftVal * rightVal;
        return leftVal / rightVal;
    }

    @Override
    public Object visitAddSub(CalcExprParser.AddSubContext ctx) {
        Object left =  visit(ctx.expr(0));
        Integer leftVal = left instanceof Integer ? (Integer) left : varlst.get(left);
        Object right =  visit(ctx.expr(1));
        Integer rightVal = right instanceof Integer ? (Integer) right : varlst.get(right);

        if (ctx.op.getType() == CalcExprParser.ADD)
            return leftVal + rightVal;
        return leftVal - rightVal;
    }

    @Override
    public Object visitId(CalcExprParser.IdContext ctx) {
        return ctx.getText();
    }

    @Override
    public Object visitInt(CalcExprParser.IntContext ctx) {
        return Integer.parseInt(ctx.getText());
    }

    @Override
    public Object visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public Object visitTerminal(TerminalNode terminalNode) {
        return terminalNode.getText();
    }

    @Override
    public Object visitErrorNode(ErrorNode errorNode) {
        return null;
    }
}

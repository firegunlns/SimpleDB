package com.lns.SimpleDB;

import com.lns.SimpleDB.gen.CalcExprBaseVisitor;
import com.lns.SimpleDB.gen.CalcExprLexer;
import com.lns.SimpleDB.gen.CalcExprParser;
import com.lns.SimpleDB.gen.CalcExprVisitor;
import com.lns.SimpleDB.gensql.SQLiteLexer;
import com.lns.SimpleDB.gensql.SQLiteParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.junit.Test;

import java.util.HashMap;

public class TestMain {
    @Test
    public void test1(){
        HashMap<String, Integer> varlst = new HashMap<>();
        varlst.put("y", 6);
        varlst.put("z", 15);

        String expr = "x=3 + y / 2 * (3+z)\n";

        CharStream input = CharStreams.fromString(expr);
        CalcExprLexer lexer = new CalcExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CalcExprParser parser = new CalcExprParser(tokens);
        ParseTree tree = parser.prog(); // parse
        System.out.println(tree.toStringTree(parser));

        CalcExprVisitor eval = new MyCalcExprVisitor(varlst);
        long l0 = System.nanoTime();
        eval.visit(tree);
        long l1 = System.nanoTime();
        System.out.printf("time used is %d us.\n", (l1 - l0) / 1000);

        for (String v : varlst.keySet()){
            System.out.printf("%s: %d\n", v, varlst.get(v));
        }
    }

    @Test
    public void test2(){
        String sql = "select count(1) from test where name like 'abc%' and age < 16 ";
        CharStream input = CharStreams.fromString(sql);
        SQLiteLexer lexer = new SQLiteLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SQLiteParser parser = new SQLiteParser(tokens);
        ParseTree tree = parser.select_stmt(); // parse
        System.out.println(tree.toStringTree(parser));

        MySQLVisitor eval = new MySQLVisitor();
        eval.visit(tree);

    }
}

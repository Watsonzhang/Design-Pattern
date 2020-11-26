package com.zhang.designpattern.interpreter;

import java.util.ArrayList;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/26 下午1:46
 */
public class TestClient {
    public static void main(String[] args) {
        Context context = new Context();
        ArrayList<AbstractExpression> expressions = new ArrayList<>();
        expressions.add(new TerminalExpression());
        expressions.add(new NonterminalExpression());
        expressions.add(new TerminalExpression());
        expressions.add(new TerminalExpression());
        expressions.forEach(i->{
            i.interpret(context);
        });
    }
}

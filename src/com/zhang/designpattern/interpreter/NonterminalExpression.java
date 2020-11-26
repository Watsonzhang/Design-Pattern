package com.zhang.designpattern.interpreter;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/26 下午1:51
 */
public class NonterminalExpression extends AbstractExpression {
    @Override
    public void interpret(Context context) {
        System.out.println("非洲终端解释器");
    }
}

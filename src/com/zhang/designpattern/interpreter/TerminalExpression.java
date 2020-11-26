package com.zhang.designpattern.interpreter;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/26 下午1:50
 */
public class TerminalExpression extends AbstractExpression {
    @Override
    public void interpret(Context context) {
        System.out.println("终端解释器");
    }
}

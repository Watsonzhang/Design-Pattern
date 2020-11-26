package com.zhang.designpattern.interpreter;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/26 下午1:49
 */
public class Context {
    private String  input;
    private String  output;


    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
}

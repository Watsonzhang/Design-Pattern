package com.zhang.designpattern.memento;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/25 上午11:22
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

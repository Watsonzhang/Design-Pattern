package com.zhang.designpattern.state;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/25 上午9:24
 */
public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        System.out.println("当前状态为"+state.getType());
    }
    public void request(){
        state.Handle(this);
    }

}

package com.zhang.designpattern.state;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/25 上午9:23
 */
 abstract class State {
     protected String type;
     public abstract void Handle(Context context);

    public State(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    protected void say(){

    }
}

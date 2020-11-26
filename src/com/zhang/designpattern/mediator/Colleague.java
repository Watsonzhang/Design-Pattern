package com.zhang.designpattern.mediator;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/26 上午11:02
 */
abstract class Colleague {
    protected String name;
    protected Mediator mediator;

    public String getName() {
        return name;
    }

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name=name;
    }

    public void send(String message){
        mediator.send(message,this);
    }

    public void action(String message){
        System.out.println(this.getName()+"得到信息"+message);
    }
}

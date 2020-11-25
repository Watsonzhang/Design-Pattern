package com.zhang.designpattern.memento;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/25 上午11:21
 */
public class Originator {
    private String state;

    public Originator(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void show(){
        System.out.println("state is"+ state);
    }

    public Memento createSavePoint(){
        return new Memento(this.getState());
    }
    public void reset(Memento memento){
        this.state=memento.getState();
    }
}


package com.zhang.designpattern.memento;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/25 上午11:28
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}

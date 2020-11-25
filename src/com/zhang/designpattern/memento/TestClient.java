package com.zhang.designpattern.memento;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/25 上午11:29
 */
public class TestClient {
    public static void main(String[] args) {
        Originator on = new Originator("on");
        on.show();
        Memento savePoint = on.createSavePoint();
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(savePoint);
        on.setState("off");
        on.show();
        on.reset(caretaker.getMemento());
        on.show();



    }
}

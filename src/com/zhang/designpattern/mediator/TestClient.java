package com.zhang.designpattern.mediator;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/26 上午10:57
 */
public class TestClient {
    public static void main(String[] args) {
        System.out.println("中介者模式");
        ConcreteMediator concreteMediator = new ConcreteMediator();
        Colleague concreteColleagueA = new ConcreteColleagueA(concreteMediator,"A同事");
        Colleague concreteColleagueB = new ConcreteColleagueA(concreteMediator,"B同事");
        concreteMediator.setConcreteColleagueA(concreteColleagueA);
        concreteMediator.setConcreteColleagueB(concreteColleagueB);
        concreteColleagueA.send("hello B");


    }
}

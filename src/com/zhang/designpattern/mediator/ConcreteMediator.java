package com.zhang.designpattern.mediator;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/26 上午11:03
 */
public class ConcreteMediator extends Mediator {

    private Colleague concreteColleagueA;
    private Colleague concreteColleagueB;

    @Override
    public void send(String message, Colleague origin) {
        if(origin==concreteColleagueA){
            concreteColleagueB.action(message);
        }else {
            concreteColleagueA.action(message);
        }
    }

    public Colleague getConcreteColleagueA() {
        return concreteColleagueA;
    }

    public void setConcreteColleagueA(Colleague concreteColleagueA) {
        this.concreteColleagueA = concreteColleagueA;
    }

    public Colleague getConcreteColleagueB() {
        return concreteColleagueB;
    }

    public void setConcreteColleagueB(Colleague concreteColleagueB) {
        this.concreteColleagueB = concreteColleagueB;
    }
}

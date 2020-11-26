package com.zhang.designpattern.flyweight;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/26 上午11:32
 */
public class TestClient {
    public static void main(String[] args) {
        System.out.println("享元模式");
        int extra=22;
        FlyWeightFactory factory = new FlyWeightFactory();
        FlyWeight x = factory.getFlwWeight("X");
        x.operation(--extra);
        FlyWeight y = factory.getFlwWeight("Y");
        y.operation(--extra);
        FlyWeight z = factory.getFlwWeight("Z");
        z.operation(--extra);

        UnsharedConcreteFlyWeight un = new UnsharedConcreteFlyWeight();
        un.operation(--extra);


    }
}

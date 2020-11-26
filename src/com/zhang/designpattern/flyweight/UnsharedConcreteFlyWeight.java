package com.zhang.designpattern.flyweight;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/26 上午11:38
 */
public class UnsharedConcreteFlyWeight implements FlyWeight {
    @Override
    public void operation(int num) {
        System.out.println("不共享的具体flyweight"+num);
    }
}

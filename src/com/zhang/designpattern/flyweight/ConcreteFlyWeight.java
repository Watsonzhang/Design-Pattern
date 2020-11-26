package com.zhang.designpattern.flyweight;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/26 上午11:34
 */
public class ConcreteFlyWeight implements FlyWeight {
    @Override
    public void operation(int num) {
        System.out.println("具体flyweight"+num);
    }
}

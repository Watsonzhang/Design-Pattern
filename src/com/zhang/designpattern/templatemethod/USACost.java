package com.zhang.designpattern.templatemethod;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/30 下午2:40
 */
public class USACost extends CostCalculate {

    @Override
    protected void doAction1() {
        System.out.println("美国1");
    }

    @Override
    protected void doAction2() {
        System.out.println("美国2");
    }

    @Override
    protected void doAction3() {
        System.out.println("美国3");
    }
}

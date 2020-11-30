package com.zhang.designpattern.templatemethod;

import edu.princeton.cs.algs4.StdOut;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/30 下午2:40
 */
public class ChinaCost extends CostCalculate {

    @Override
    protected void doAction1() {
        System.out.println("中国1");
    }

    @Override
    protected void doAction2() {
        System.out.println("中国2");
    }

    @Override
    protected void doAction3() {
        System.out.println("中国3");
    }
}

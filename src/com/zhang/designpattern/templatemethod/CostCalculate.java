package com.zhang.designpattern.templatemethod;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/30 下午2:39
 */
public abstract class CostCalculate {
    public void calculate(){
        doAction1();
        doAction2();
        doAction3();
    }

    protected abstract void doAction1();
    protected abstract void doAction2();
    protected abstract void doAction3();
}

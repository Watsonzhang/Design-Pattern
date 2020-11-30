package com.zhang.designpattern.abstractfactory;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/30 上午9:46
 */
public class LRDD implements DisplayDriver,PrintDriver {
    @Override
    public void doDisplay() {
        System.out.println("this is low display");
    }

    @Override
    public void doPrint() {
        System.out.println("this is low print");
    }
}

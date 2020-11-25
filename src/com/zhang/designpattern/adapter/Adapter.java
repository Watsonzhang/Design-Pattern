package com.zhang.designpattern.adapter;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/25 上午11:03
 */
public class Adapter extends Target {
    private Adaptee adaptee=new Adaptee();
    @Override
    void request() {
        System.out.println("this is adapter request");
        adaptee.specificRequest();
    }
}

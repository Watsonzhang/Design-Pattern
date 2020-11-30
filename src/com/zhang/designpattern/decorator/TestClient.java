package com.zhang.designpattern.decorator;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/30 上午11:22
 */
public class TestClient {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Component component = factory.getComponent();
        component.prtTicket();
    }
}

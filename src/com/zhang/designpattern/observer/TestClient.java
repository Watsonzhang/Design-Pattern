package com.zhang.designpattern.observer;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/30 下午1:43
 */
public class TestClient {
    public static void main(String[] args) {
        WelComeLetter welComeLetter = new WelComeLetter();
        Customer customer = new Customer();
        customer.attach(welComeLetter);
        customer.notifyObs();
    }
}


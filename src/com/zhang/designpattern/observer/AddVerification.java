package com.zhang.designpattern.observer;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/30 下午2:08
 */
public class AddVerification implements MyObserver {

    public AddVerification() {
    }

    @Override
    public void update(Customer customer) {
        System.out.println("开始验证相关信息");
    }
}

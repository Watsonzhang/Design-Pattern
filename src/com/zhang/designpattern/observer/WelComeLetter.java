package com.zhang.designpattern.observer;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/30 下午2:09
 */
public class WelComeLetter implements MyObserver {
    public WelComeLetter() {
    }

    @Override
    public void update(Customer customer) {
        System.out.println("开始发送欢迎邮件");
    }
}

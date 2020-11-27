package com.zhang.designpattern.strategy;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/27 下午3:10
 */
public class TestClient {
    public static void main(String[] args) {
        MyStrategy a = new MyStrategy.AStrategy();
        MyStrategy b = new MyStrategy.BStrategy();
        a.play();
        b.play();
    }
}

package com.zhang.designpattern.state;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/25 上午9:27
 */
public class TestClient {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStateA("A状态"));
        context.request();
        context.request();
        context.request();
    }
}

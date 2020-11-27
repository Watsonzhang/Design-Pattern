package com.zhang.designpattern.bridge;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/26 上午9:37
 */
public class TestClient {
    public static void main(String[] args) {
        Abstraction abstraction = new RefineAbstraction(new BImplementor());
        abstraction.operation();
    }
}

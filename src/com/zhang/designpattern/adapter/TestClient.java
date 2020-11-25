package com.zhang.designpattern.adapter;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/25 上午11:06
 */
public class TestClient {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}

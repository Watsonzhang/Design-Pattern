package com.zhang.designpattern.abstractfactory;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/30 上午9:37
 */
public class TestClient {
    public static void main(String[] args) {
        //可由配置决定实例化哪个
        ResFactory lowResFact = new LowResFact();
        DisplayDriver dis = lowResFact.getDisplayPlayDriver();
        dis.doDisplay();
    }
}

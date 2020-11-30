package com.zhang.designpattern.templatemethod;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/30 下午2:35
 */
public class TestClient {
    public static void main(String[] args) {
        DefaultFactory defaultFactory = new DefaultFactory();
        CostCalculate cal = defaultFactory.getImplementor();
        cal.calculate();
    }
}

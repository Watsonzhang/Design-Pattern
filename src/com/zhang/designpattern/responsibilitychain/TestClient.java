package com.zhang.designpattern.responsibilitychain;

import java.util.Arrays;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/26 上午10:17
 */
public class TestClient {
    public static void main(String[] args) {
        Handler handleA = new ConcreteHandleA();
        Handler handleB = new ConcreteHandleB();
        Handler handleC = new ConcreteHandleC();
        handleA.setSuccessor(handleB);
        handleB.setSuccessor(handleC);
        Arrays.asList(1, 0, 10, 12, 7, 120, 0).forEach(handleA::handle);
    }
}

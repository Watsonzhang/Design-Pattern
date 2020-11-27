package com.zhang.designpattern.bridgenew;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/27 下午3:50
 */
public class TestClient {
    public static void main(String[] args) {
        Shape v1Rectangle = new V1Rectangle(1.0, 2.0, 3.0, 4.0);
        v1Rectangle.draw();

    }
}

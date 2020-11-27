package com.zhang.designpattern.bridgenew.solution;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/27 下午4:33
 */
public class TestClient {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(new V2Drawing());
        rectangle.draw();
    }
}

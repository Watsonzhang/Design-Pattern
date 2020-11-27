package com.zhang.designpattern.bridgenew.solution;


/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/27 下午3:43
 */
public class Rectangle extends Shape {

    public Rectangle(Drawing dw) {
        super(dw);
    }

    @Override
    public void draw() {
        drawLine();
    }
}

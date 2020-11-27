package com.zhang.designpattern.bridgenew.solution;


/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/27 下午3:48
 */
public class Circle extends Shape{

    public Circle(Drawing dw) {
        super(dw);
    }

    @Override
    public void draw() {
        dw.drawCircle();
    }
}

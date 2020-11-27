package com.zhang.designpattern.bridgenew.solution;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/27 下午3:42
 */
public abstract class Shape {
    protected Drawing dw;

    public Shape(Drawing dw) {
        this.dw = dw;
    }

    abstract public void draw();
    void drawLine(){
        dw.drawLine();
    }
    private void drawCircle(){
        dw.drawCircle();
    }
}

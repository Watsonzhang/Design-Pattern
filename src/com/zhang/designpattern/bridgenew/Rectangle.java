package com.zhang.designpattern.bridgenew;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/27 下午3:43
 */
abstract class Rectangle extends Shape {
    private Double _x1,_y1,_x2,_y2;

    public Rectangle(Double _x1, Double _y1, Double _x2, Double _y2) {
        this._x1 = _x1;
        this._y1 = _y1;
        this._x2 = _x2;
        this._y2 = _y2;
    }
    public void draw(){
        drawLine(_x1,_y1,_x2,_y2);
    }

    protected abstract void drawLine(Double x1, Double y1, Double x2, Double y2);
}

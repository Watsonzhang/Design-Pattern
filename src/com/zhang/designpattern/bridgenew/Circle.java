package com.zhang.designpattern.bridgenew;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/27 下午3:48
 */
abstract class Circle  extends Shape{
    protected double _x,_y,_r;

    public Circle(double _x, double _y, double _r) {
        this._x = _x;
        this._y = _y;
        this._r = _r;
    }
    @Override
    public void draw(){
        drawCircle();
    }

    protected abstract void drawCircle();
}

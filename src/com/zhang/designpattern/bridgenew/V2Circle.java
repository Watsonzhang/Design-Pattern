package com.zhang.designpattern.bridgenew;

import com.zhang.designpattern.bridgenew.solution.util.DP2;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/27 下午3:49
 */
public class V2Circle extends Circle {
    public V2Circle(double _x, double _y, double _r) {
        super(_x, _y, _r);
    }

    @Override
    protected void drawCircle() {
        DP2.drawCircle();
    }
}

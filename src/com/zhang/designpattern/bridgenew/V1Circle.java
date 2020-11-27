package com.zhang.designpattern.bridgenew;

import com.zhang.designpattern.bridgenew.solution.util.DP1;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/27 下午3:49
 */
public class V1Circle extends Circle {
    public V1Circle(double _x, double _y, double _r) {
        super(_x, _y, _r);
    }

    @Override
    protected void drawCircle() {
        DP1.draw_a_circle();
    }
}

package com.zhang.designpattern.bridgenew;

import com.zhang.designpattern.bridgenew.solution.util.DP1;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/27 下午3:44
 */
public class V1Rectangle extends Rectangle {
    public V1Rectangle(Double _x1, Double _y1, Double _x2, Double _y2) {
        super(_x1, _y1, _x2, _y2);
    }

    @Override
    protected void drawLine(Double x1, Double y1, Double x2, Double y2) {
        DP1.draw_a_line();
    }
}

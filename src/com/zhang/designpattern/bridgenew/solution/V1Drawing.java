package com.zhang.designpattern.bridgenew.solution;

import com.zhang.designpattern.bridgenew.solution.util.DP1;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/27 下午4:25
 */
public class V1Drawing implements Drawing {
    @Override
    public void drawLine() {
        DP1.draw_a_line();
    }

    @Override
    public void drawCircle() {
        DP1.draw_a_circle();
    }
}

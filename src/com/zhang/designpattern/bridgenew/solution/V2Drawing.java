package com.zhang.designpattern.bridgenew.solution;

import com.zhang.designpattern.bridgenew.solution.util.DP2;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/27 下午4:25
 */
public class V2Drawing implements Drawing {
    @Override
    public void drawLine() {
        DP2.drawLine();
    }

    @Override
    public void drawCircle() {
        DP2.drawCircle();
    }
}

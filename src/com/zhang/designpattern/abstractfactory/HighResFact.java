package com.zhang.designpattern.abstractfactory;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/30 上午9:41
 */
public class HighResFact extends ResFactory {
    @Override
    public DisplayDriver getDisplayPlayDriver() {
        return new LRDD();
    }

    @Override
    public PrintDriver getPrintPlayDriver() {
        return new HRDD();
    }
}

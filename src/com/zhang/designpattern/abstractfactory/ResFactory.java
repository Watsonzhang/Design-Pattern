package com.zhang.designpattern.abstractfactory;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/30 上午9:39
 */
public abstract class ResFactory {
    abstract public DisplayDriver getDisplayPlayDriver();
    abstract public PrintDriver getPrintPlayDriver();
}

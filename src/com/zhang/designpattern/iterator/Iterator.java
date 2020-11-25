package com.zhang.designpattern.iterator;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/25 下午2:26
 */
abstract class Iterator {
    public abstract Object first();
    public abstract Object next();
    public abstract boolean isDone();
    public abstract Object currentItem();
}

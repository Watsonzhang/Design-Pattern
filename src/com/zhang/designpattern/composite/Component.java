package com.zhang.designpattern.composite;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/25 下午1:45
 */
abstract class Component {
    protected  String name;

    public Component(String name) {
        this.name = name;
    }
    public abstract void add(Component c);
    public abstract void remove(Component c);
    public abstract void display(int depth);
}

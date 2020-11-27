package com.zhang.designpattern.bridge;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/26 上午9:33
 */
public abstract class Abstraction {
    protected Implementor implementor;
    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }
    public void operation(){
        implementor.operation();
    }
}

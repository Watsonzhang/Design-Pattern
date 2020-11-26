package com.zhang.designpattern.bridge;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/26 上午9:33
 */
public class Abstraction {
    public Implementor getImplementor() {
        return implementor;
    }

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    protected Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }
    public void operation(){
        implementor.operation();
    }
}

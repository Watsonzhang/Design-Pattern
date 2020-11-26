package com.zhang.designpattern.mediator;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/26 上午11:01
 */
abstract class Mediator {
    public abstract void send(String message,Colleague colleague);
}

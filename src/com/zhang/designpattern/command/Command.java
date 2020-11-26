package com.zhang.designpattern.command;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/26 上午9:44
 */
abstract class Command {
    protected Barbecuer receiver;

    public Command(Barbecuer receiver) {
        this.receiver = receiver;
    }
    public abstract void exec();
}

package com.zhang.designpattern.responsibilitychain;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/26 上午10:17
 */
abstract class Handler {
    //继任者
    protected Handler successor;

    public Handler() {
    }

    public Handler(Handler successor) {
        this.successor = successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handle(int request);

}

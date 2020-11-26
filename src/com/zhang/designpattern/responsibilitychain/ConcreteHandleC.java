package com.zhang.designpattern.responsibilitychain;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/26 上午10:19
 */
public class ConcreteHandleC extends Handler {

    public ConcreteHandleC() {
    }
    public ConcreteHandleC(Handler successor) {
        super(successor);
    }

    @Override
    public void handle(int request) {
        System.out.println("大于等于10 被C处理");
    }
}

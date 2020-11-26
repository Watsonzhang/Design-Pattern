package com.zhang.designpattern.responsibilitychain;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/26 上午10:19
 */
public class ConcreteHandleB extends Handler {

    public ConcreteHandleB() {
    }

    public ConcreteHandleB(Handler successor) {
        super(successor);
    }

    @Override
    public void handle(int request) {
        if(request<10 && request!=0){
            System.out.println("小于10时 被B处理");
        }else {
            this.successor.handle(request);
        }
    }
}

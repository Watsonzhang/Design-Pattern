package com.zhang.designpattern.responsibilitychain;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/26 上午10:19
 */
public class ConcreteHandleA extends Handler {
    public ConcreteHandleA() {
    }

    public ConcreteHandleA(Handler successor) {
        super(successor);
    }

    @Override
    public void handle(int request) {
        if(request==0){
            System.out.println("等于0 被A处理");
        }else {//不等于0 转给B
          successor.handle(request);
        }
    }
}

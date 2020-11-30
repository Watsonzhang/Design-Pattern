package com.zhang.designpattern.decorator;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/30 上午11:39
 */
public class Factory {
    public Component getComponent(){
        Component component;
         component = new SalesTicket();
         component = new Footer1(component);
         component = new Header1(component);
         return component;
    }
}

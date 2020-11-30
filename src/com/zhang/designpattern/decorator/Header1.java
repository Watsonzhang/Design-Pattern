package com.zhang.designpattern.decorator;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/30 上午11:35
 */
public class Header1 extends TicketDecorator {
    public Header1(Component myTrailer) {
        super(myTrailer);
    }

    @Override
    public void prtTicket() {
        System.out.println("开始打印表头1");
        super.callTrailer();
    }
}

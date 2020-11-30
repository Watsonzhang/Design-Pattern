package com.zhang.designpattern.decorator;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/30 上午11:35
 */
public class Header2 extends TicketDecorator {
    public Header2(Component myTrailer) {
        super(myTrailer);
    }

    @Override
    public void prtTicket() {
        System.out.println("开始打印表头2");
        super.callTrailer();
    }
}

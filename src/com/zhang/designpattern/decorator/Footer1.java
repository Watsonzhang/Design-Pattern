package com.zhang.designpattern.decorator;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/30 上午11:37
 */
public class Footer1 extends TicketDecorator {
    public Footer1(Component myTrailer) {
        super(myTrailer);
    }

    @Override
    public void prtTicket() {
        System.out.println("开始打印页脚1");
        super.callTrailer();
    }
}

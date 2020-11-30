package com.zhang.designpattern.decorator;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/30 上午11:37
 */
public class Footer2 extends TicketDecorator {
    public Footer2(Component myTrailer) {
        super(myTrailer);
    }

    @Override
    public void prtTicket() {
        super.callTrailer();
        System.out.println("开始打印页脚2");
    }
}

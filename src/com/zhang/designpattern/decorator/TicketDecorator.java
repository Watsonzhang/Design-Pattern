package com.zhang.designpattern.decorator;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/30 上午11:32
 */
abstract public class TicketDecorator extends Component {
    private Component myTrailer;

    public TicketDecorator(Component myTrailer) {
        this.myTrailer = myTrailer;
    }
    public void callTrailer(){
        if(myTrailer!=null){
            myTrailer.prtTicket();
        }
    }
}

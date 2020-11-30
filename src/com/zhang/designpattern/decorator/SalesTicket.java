package com.zhang.designpattern.decorator;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/30 上午11:31
 */
public class SalesTicket extends Component {
    @Override
    public void prtTicket() {
        System.out.println("开始打印销售票据");
    }
}

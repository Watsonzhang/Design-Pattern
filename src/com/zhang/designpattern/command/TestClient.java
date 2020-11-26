package com.zhang.designpattern.command;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/26 上午9:41
 */
public class TestClient {
    public static void main(String[] args) {
        Barbecuer barbecuer = new Barbecuer();
        Command chickWingCommand = new BakeChickWingCommand(barbecuer);
        Command muttonCommand = new BakeMuttonCommand(barbecuer);
        Waiter waiter = new Waiter();
        waiter.addCommand(chickWingCommand);
        waiter.addCommand(muttonCommand);
        waiter.notifyReceiver();


    }
}

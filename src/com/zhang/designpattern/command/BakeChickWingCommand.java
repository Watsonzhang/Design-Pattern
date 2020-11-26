package com.zhang.designpattern.command;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/26 上午9:48
 */
public class BakeChickWingCommand extends Command {

    public BakeChickWingCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void exec() {
        receiver.bakeChickWing();
    }
}

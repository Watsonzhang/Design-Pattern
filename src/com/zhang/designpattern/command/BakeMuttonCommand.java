package com.zhang.designpattern.command;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/26 上午9:46
 */
public class BakeMuttonCommand extends Command {

    public BakeMuttonCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void exec() {
        receiver.bakeMutton();
    }
}

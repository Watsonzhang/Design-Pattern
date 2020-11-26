package com.zhang.designpattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/26 上午9:55
 */
public class Waiter {

    private List<Command> commands=new ArrayList<>(100);

    public void addCommand(Command command){
        System.out.println("新增指令");
        this.commands.add(command);
    }

    public void notifyReceiver(){
       this.commands.forEach(Command::exec);
    }

}

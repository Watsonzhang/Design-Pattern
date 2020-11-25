package com.zhang.designpattern.state;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/25 上午9:24
 */
public class ConcreteStateC extends State {
    public ConcreteStateC(String type) {
        super(type);
    }

    @Override
    public void Handle(Context context) {
        context.setState(new ConcreteStateA("状态A"));
    }
}

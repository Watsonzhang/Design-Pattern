package com.zhang.designpattern.bridge;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/26 上午9:32
 */
public class AImplementor extends Implementor {
    @Override
    public void operation() {
        System.out.println("this is a ");
    }
}

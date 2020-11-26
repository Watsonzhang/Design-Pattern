package com.zhang.designpattern.bridge;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/26 上午9:33
 */
public class BImplementor extends Implementor {
    @Override
    public void operation() {
        System.out.println("this is B");
    }
}

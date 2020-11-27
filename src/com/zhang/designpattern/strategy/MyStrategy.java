package com.zhang.designpattern.strategy;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/27 下午3:09
 */
abstract class MyStrategy {
    abstract void play();
    static class AStrategy extends MyStrategy{
        @Override
        void play() {
            System.out.println("this is a");
        }
    }
    static class BStrategy extends MyStrategy{
        @Override
        void play() {
            System.out.println("this is b");
        }
    }
}


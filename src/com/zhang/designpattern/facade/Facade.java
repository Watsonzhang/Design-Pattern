package com.zhang.designpattern.facade;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/27 上午11:22
 */
public  class Facade {
    private static SubSystemOne one;
    private static SubSystemTwo two;
    private static SubSystemThree three;
    private static SubSystemFour four;

    static {
        one = new SubSystemOne();
        two = new SubSystemTwo();
        three = new SubSystemThree();
        four = new SubSystemFour();
    }

    public static void methodA(){
        one.methodOne();
        two.methodTwo();
        three.methodThree();
        four.methodFour();
    }
}

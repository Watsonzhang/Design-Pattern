package com.zhang.designpattern.templatemethod;

import java.util.Random;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/30 下午2:38
 */
public class DefaultFactory implements Factory {
    @Override
    public CostCalculate getImplementor() {
        Random random = new Random();
        boolean b = random.nextBoolean();
        if(b){
            return new ChinaCost();
        }
        return new USACost();
    }
}

package com.zhang.designpattern.templatemethod;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/30 下午2:35
 */
public interface Factory {
    CostCalculate getImplementor();
}

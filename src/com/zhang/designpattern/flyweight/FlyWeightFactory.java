package com.zhang.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/26 上午11:39
 */
public class FlyWeightFactory {

    private Map<String, FlyWeight> fw=new HashMap<>();

    public FlyWeightFactory() {
       fw.put("X",new ConcreteFlyWeight());
       fw.put("Y",new ConcreteFlyWeight());
       fw.put("Z",new ConcreteFlyWeight());
    }

    public FlyWeight getFlwWeight(String key){
        return fw.get(key);
    }
}

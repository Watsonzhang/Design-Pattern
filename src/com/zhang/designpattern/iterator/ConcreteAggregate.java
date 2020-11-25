package com.zhang.designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/25 下午2:30
 */
public class ConcreteAggregate extends Aggregate {
    private List<Object> items = new ArrayList<>();

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public int count() {
        return items.size();
    }

    public Object index(int index) {
        return items.get(index);
    }

    public void add(Object o) {
        items.add(o);
    }
}

package com.zhang.designpattern.iterator;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/25 下午2:36
 */
public class TestClient {
    public static void main(String[] args) {
        ConcreteAggregate aggregate = new ConcreteAggregate();
        aggregate.add("a");
        aggregate.add("b");
        aggregate.add("c");
        ConcreteIterator iterator = new ConcreteIterator(aggregate);
        while (!iterator.isDone()){
            System.out.println(iterator.currentItem());
            iterator.next();
        }
    }
}

package com.zhang.designpattern.composite;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/25 下午1:54
 */
public class TestClient {
    public static void main(String[] args) {
        Composite root = new Composite("root");
        root.add(new Leaf("leaf A"));
        root.add(new Leaf("leaf B"));

        Composite comp = new Composite("composite X");
        comp.add(new Leaf("leaf XA"));
        comp.add(new Leaf("leaf XB"));
        root.add(comp);

        Composite comp2 = new Composite("composite XY");
        comp.add(new Leaf("leaf XYA"));
        comp.add(new Leaf("leaf XYB"));
        comp.add(comp2);

        root.add(new Leaf("leaf C"));
        root.display(1);
    }
}

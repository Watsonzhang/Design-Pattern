package com.zhang.designpattern.composite;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/25 下午1:47
 */
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        System.out.println("cannot add ");
    }

    @Override
    public void remove(Component c) {
        System.out.println("can not remove");
    }

    @Override
    public void display(int depth) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        System.out.println(sb+name);
    }
}

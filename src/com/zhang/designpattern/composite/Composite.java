package com.zhang.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/25 下午1:49
 */
public class Composite extends Component {

    private List<Component>  children=new ArrayList<>(12);

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        System.out.println(sb+name);
     children.forEach(i->{
          i.display(depth+2);
     });
    }


}

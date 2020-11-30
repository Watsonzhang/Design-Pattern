package com.zhang.designpattern.observer;

import java.util.Vector;

/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/30 下午1:58
 */
public class Customer {
     private Vector<MyObserver> myobs;
     {
        myobs=new Vector();
    }

    public  void attach(MyObserver observer) {
        myobs.add(observer);
    }

    public  void detach(MyObserver observer) {
        myobs.remove(observer);
    }
    public String getState(){
        return null;
    }
    public void notifyObs(){
        myobs.forEach(i->{
            i.update(this);
        });
    }
}

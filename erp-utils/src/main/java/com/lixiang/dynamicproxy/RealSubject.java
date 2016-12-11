package com.lixiang.dynamicproxy;

/**
 * Created by lixiang on 2016/7/2.
 */
public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("from RealSubject");
    }

}

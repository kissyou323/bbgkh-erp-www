package com.lixiang.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by lixiang on 2016/7/2.
 */
public class DynamicSubject implements InvocationHandler {

    private  Subject sub;

    public DynamicSubject(Subject sub) {
        this.sub = sub;
    }



    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("before calling: "+method);

        method.invoke(sub,args);

        System.out.println("after calling: "+method);

        return null;
    }


}

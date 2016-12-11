package com.lixiang.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by lixiang on 2016/8/2.
 */
public class BookFacadeProxy implements MethodInterceptor{

    private Object target;

    public Object getInstance(Object target){
        this.target=target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("begin");
        methodProxy.invokeSuper(o,objects);
        System.out.println("end");
        return null;
    }
}

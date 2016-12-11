package com.lixiang.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * Created by lixiang on 2016/7/2.
 */
public class ProxySubject  {

    public static Object getObject(){

        Class<?> clazz = Subject.class;

        return Proxy.newProxyInstance(clazz.getClassLoader(),new Class[]{clazz}, new DynamicSubject(new RealSubject()));
    }

}

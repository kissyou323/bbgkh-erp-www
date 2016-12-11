package com.lixiang.javaEight.day1;

/**
 * Created by lixiang on 8/23/2016.
 */

/**
 * 接口中的default方法
 */
interface Default {

    String forimple();

    default String sayHello(){
        return "this is from default";
    }

    static void teststatic(){
        System.out.println("this is from static");
    }
}

public class InterfaceDefault{
    public static void main(String[] args) {
        Default d = ()->{return  "this is from forimple";};
        System.out.println(d.sayHello());

        Default.teststatic();
    }
}
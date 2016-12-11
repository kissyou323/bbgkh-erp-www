package com.lixiang.methodInject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lixiang on 2016/7/26.
 */
public class MethodMain {



    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringContext.xml");

        PersonBean personBean = (PersonBean) applicationContext.getBean("personBean");


        System.out.println(personBean.getDepBean());
    }
}

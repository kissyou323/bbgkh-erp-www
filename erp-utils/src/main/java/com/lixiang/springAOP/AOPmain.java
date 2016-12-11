package com.lixiang.springAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lixiang on 2016/8/1.
 */
public class AOPmain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringAOP.xml");
        PointCutA pointCutA = applicationContext.getBean("pointA",PointCutA.class);
        pointCutA.pointcut();

    }
}

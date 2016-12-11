package com.lixiang.methodInject;

import org.springframework.context.SmartLifecycle;

/**
 * Created by lixiang on 2016/7/14.
 */
public class PersonBean implements SmartLifecycle{

    private int age;
    private String name;
    DepBean depBean;


/*
    public void init(){
        System.out.println("init");
    }
*/


    public DepBean getDepBean() {
        return depBean;
    }

    public void setDepBean(DepBean depBean) {
        this.depBean = depBean;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean isAutoStartup() {
        return false;
    }

    @Override
    public void stop(Runnable callback) {

    }

    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void stop() {

    }

    @Override
    public boolean isRunning() {
        return false;
    }

    @Override
    public int getPhase() {
        return 0;
    }
}

package com.lixiang.methodInject;

import org.springframework.context.Lifecycle;

/**
 * Created by lixiang on 2016/7/26.
 */
public class DepBean implements Lifecycle{
    @Override
    public void start() {
        System.out.println("Started");
    }

    @Override
    public void stop() {

    }

    @Override
    public boolean isRunning() {
        return false;
    }
}

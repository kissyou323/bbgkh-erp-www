package com.lixiang.studyThread.day1;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by lixiang on 9/5/2016.
 */
public class ThreadDay1 {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(10);
        atomicInteger.incrementAndGet();
        System.out.println(atomicInteger);
    }
}

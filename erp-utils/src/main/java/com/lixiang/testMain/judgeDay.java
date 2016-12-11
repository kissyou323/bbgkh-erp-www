package com.lixiang.testMain;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by lixiang on 10/28/2016.
 */
public class judgeDay {

    public static void main(String[] args) {
        System.out.println("我想试一下中文");
        System.out.println(testStatic.a);
        testStatic.a=4;
        System.out.println(testStatic.a);
        AtomicInteger got = new AtomicInteger();
        Thread thread = new Thread(new inner(got),"a");
        thread.start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(got);

    }
    static class inner implements Runnable{
        AtomicInteger a ;
        public inner(AtomicInteger a ){
         this.a=a;
        }


        @Override
        public void run() {
            a.incrementAndGet();
        }
    }

}

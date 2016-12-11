package com.lixiang.studyThread;

import java.util.concurrent.TimeUnit;

/**
 * Created by lixiang on 11/11/2016.
 */
public class ThreadState {

    public static void main(String[] args) {
        new Thread(new TimeWaiting(),"TimeWaitingThread").start();
        new Thread(new Waiting(),"WaitingThread").start();
        //two Bolocked threads , one get the lock , and another is blocked
        new Thread(new Blocked(),"BlockThread-1").start();
        new Thread(new Blocked(),"BlockThread-2").start();
    }

    //this thread will be sleep forever
    static class TimeWaiting implements Runnable{

        @Override
        public void run() {
            while (true){
                try {
                    TimeUnit.SECONDS.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // this thread is always waiting on the instance of Waiting.class
    static class Waiting implements Runnable{

        @Override
        public void run() {
            while (true){
                synchronized (Waiting.class){
                    try {
                        Waiting.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    //this thread keep a lock on Object Blocked , And never release it
    static class Blocked implements Runnable{

        @Override
        public void run() {
            synchronized (Blocked.class){
                while(true){
                    try {
                        TimeUnit.SECONDS.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

}

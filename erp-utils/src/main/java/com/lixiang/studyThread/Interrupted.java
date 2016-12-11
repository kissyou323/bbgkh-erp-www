package com.lixiang.studyThread;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

/**
 * Created by lixiang on 11/15/2016.
 */
public class Interrupted {
    public static void main(String[] args) throws InterruptedException {
        Thread sleepThread = new Thread(new SleepRunner(),"SleepThread");
        sleepThread.setDaemon(true);
        Thread busyThread = new Thread(new BusyRunner(),"BusyThread");
        busyThread.setDaemon(true);
        sleepThread.start();
        busyThread.start();
        TimeUnit.SECONDS.sleep(5);
        sleepThread.interrupt();
        busyThread.interrupt();
        System.out.println("sleepThread is "+sleepThread.isInterrupted());
        System.out.println("busyThread is "+busyThread.isInterrupted());
        TimeUnit.SECONDS.sleep(2);
    }
    static class SleepRunner implements Runnable{

        @Override
        public void run() {
            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class BusyRunner implements Runnable{

        @Override
        public void run() {
            while (true){

            }
        }
    }
}

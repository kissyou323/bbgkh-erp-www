package com.lixiang.studyThread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by lixiang on 11/16/2016.
 */
public class WaitNotify {
    static boolean flag = true;
    static Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread waitThread = new Thread(new Wait(),"WaitThread");
        waitThread.start();
        /*TimeUnit.SECONDS.sleep(1);
        Thread notifyThread = new Thread(new Notify(),"NotifyThread");
        notifyThread.start();*/

    }

    static class Wait implements Runnable{

        @Override
        public void run() {
            System.out.println("before lock");
            synchronized (lock){
                System.out.println("after lock");
                while (flag){
                    System.out.println("in the while");
                    try {
                        System.out.println(Thread.currentThread()
                        +" flag is true. Wait @ "+
                        new SimpleDateFormat("HH:mm:ss").format(new Date()));
                        lock.wait(1000);
                        System.out.println("after wait");
                    }catch (Exception e){

                    }
                }
                System.out.println(Thread.currentThread()+"flag is false. Running @ "+new SimpleDateFormat("HH:mm:ss").format(new Date()));
            }
        }
    }

    static class Notify implements Runnable{

        @Override
        public void run() {
            synchronized (lock){
                System.out.println(Thread.currentThread()+" hold lock. notify @"
                +new SimpleDateFormat("HH:mm:ss").format(new Date()));
                lock.notifyAll();
                flag=false;
                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            synchronized (lock){
                System.out.println(Thread.currentThread()
                        +"hold lock again. Sleep @ "
                        +new SimpleDateFormat("HH:mm:ss").format(new Date()));
                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }

}

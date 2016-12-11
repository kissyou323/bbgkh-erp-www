package com.lixiang.studyThread;

import java.util.concurrent.TimeUnit;

/**
 * Created by lixiang on 17/11/2016.
 */
public class Join {

    public static void main(String[] args) throws InterruptedException {
        Thread previos = Thread.currentThread();

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new Domino(previos),String.valueOf(i));
            previos=thread;
            thread.start();
        }
        TimeUnit.SECONDS.sleep(5);
        System.out.println(Thread.currentThread().getName()+" ttttttt");

    }

    static class Domino implements Runnable{

        private Thread previos;

        public Domino(Thread previos){
            this.previos=previos;
        }

        @Override
        public void run() {
            try {
                previos.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" terminal");
        }
    }


}

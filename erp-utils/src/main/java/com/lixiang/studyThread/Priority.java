package com.lixiang.studyThread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by lixiang on 07/11/2016.
 */
public class Priority {

    private static volatile boolean notStart  = true;

    private static volatile boolean notEnd = true;

    public static void main(String[] args) throws InterruptedException {
        List<job> jobs = new ArrayList<>();
        // Set Priority for each thread
        for (int i = 0; i < 10; i++) {
            int priority =i<5?Thread.MIN_PRIORITY:Thread.MAX_PRIORITY;
            job jjob = new job(priority);
            jobs.add(jjob);
            Thread thread = new Thread(jjob,"Thread: "+i);
            thread.setPriority(priority);
            thread.start();
        }

        notStart = false;
        TimeUnit.SECONDS.sleep(10);
        notEnd = false;

        for (job jjob : jobs) {
            System.out.println(jjob.count);
        }


    }

    //静态内部类来实现线程的相关操作
    static class job implements Runnable{
        private int priority;
        private long count;

        public job(int priority) {
            this.priority=priority;
        }
        //如果还没开始，则不进行计数，如果还没有结束，则计数，并当前线程释放处理器资源
        @Override
        public void run() {
            while (notStart){
                Thread.yield();
            }
            while (notEnd){
                Thread.yield();
                count++;
            }
        }
    }
}

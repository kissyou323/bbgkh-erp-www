package com.lixiang.studyThread.ThreadPoolPac;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by lixiang on 22/11/2016.
 */
public class DefaultThreadPool<Job extends Runnable> implements ThreadPool<Job>{
    //线程池最大限制数
    private static final int MAX_WORKER_NUMBERS =10;
    //线程池默认的数量
    private static final int DEFAULT_WORKER_NUMBERS =5;
    //线程池最小的数量
    private static final int MIN_WORKER_NUMBERS =1;
    //这是一个工作列表，将会向里面插入工作
    private final LinkedList<Job> jobs = new LinkedList<Job>();
    //工作者列表
    private final List<Worker> workers = Collections.synchronizedList(new ArrayList<Worker>());
    //工作者线程的数量
    private int workerNum = DEFAULT_WORKER_NUMBERS;
    //线程编号的生成
    private AtomicLong threadNum = new AtomicLong();

    public DefaultThreadPool(int num){
        workerNum = num>MAX_WORKER_NUMBERS?
                MAX_WORKER_NUMBERS:num<MIN_WORKER_NUMBERS?
                MIN_WORKER_NUMBERS:num;
        initializeWorkers(workerNum);
    }
    @Override
    public void execute(Job job) {
        if(job!=null){
            //添加一个工作，然后进行通知
            synchronized (jobs){
                jobs.addLast(job);
                jobs.notify();
            }
        }

    }

    @Override
    public void shutdown() {
        for (Worker worker : workers) {
            worker.shutdown();
        }
    }

    @Override
    public void addWorkers(int num) {

    }

    @Override
    public void removeWorker(int num) {

    }

    @Override
    public int getJobSize() {
        return 0;
    }

    private void initializeWorkers(int num){

    }

    class Worker implements Runnable{

        @Override
        public void run() {

        }
        public void shutdown(){

        }
    }
}

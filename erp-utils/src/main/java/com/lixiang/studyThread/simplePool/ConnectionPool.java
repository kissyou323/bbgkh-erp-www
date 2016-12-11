package com.lixiang.studyThread.simplePool;

import java.sql.Connection;
import java.util.LinkedList;

/**
 * Created by lixiang on 20/11/2016.
 */
public class ConnectionPool {

    //线程池用一个双端队列表示
    private LinkedList<Connection> pool = new LinkedList<>();

    // 初始化线程池
    public ConnectionPool(int initialSize){
        if(initialSize>0){
            for (int i = 0; i < initialSize; i++) {
                pool.add(ConnectionDriver.createConnection());
            }
        }
    }

    /**
     * 释放一个线程，被释放的被添加到队列中
     * @param connection
     */
    public void releaseConnection(Connection connection){
        if(connection!=null){
            synchronized(pool){
                pool.addLast(connection);
                pool.notifyAll();
            }
        }
    }

    /**
     * 客户端在一定时间内获取Connect 实例
     * @param mills
     * @return
     * @throws InterruptedException
     */
    public Connection fetchConnection(long mills) throws InterruptedException {
        //对池子加锁
        synchronized (pool){
            if(mills<=0){
                //如果等待时间小于0，那么就直接判断池子是否为空
                while (pool.isEmpty()){
                    //若为空，则让当前请求的线程先眠
                    pool.wait();
                }
                //若不为空，则从池子中取出一个
                return pool.removeFirst();
            }else {
                //如果时间不为空，则进入等待
                long future = System.currentTimeMillis()+mills;
                long remaining = mills;
                while (pool.isEmpty() && remaining>0){
                    pool.wait(remaining);
                    remaining=future-System.currentTimeMillis();
                }
                //在等待时间结束之后，如果池子还是空的， 那就返回空
                Connection result = null;
                if(!pool.isEmpty()){
                    result = pool.removeFirst();
                }
                return result;
            }
        }
    }

}

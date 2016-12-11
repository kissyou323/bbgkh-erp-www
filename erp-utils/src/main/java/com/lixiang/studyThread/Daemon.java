package com.lixiang.studyThread;

import java.util.concurrent.TimeUnit;

/**在构建Daemon线程时，不能依靠finally块中的内容来确保执行关闭或清理资源的逻辑
 * Created by lixiang on 13/11/2016.
 */
public class Daemon {
    public static void main(String[] args) {
        Thread thread = new Thread(new DaemonRunner(),"Daemon");
        thread.setDaemon(true);
        thread.start();

    }
    static class DaemonRunner implements Runnable{

        @Override
        public void run() {
            try{
                System.out.println("I am going to the run");
                TimeUnit.SECONDS.sleep(10);
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                System.out.println("DaemonThread finally run");
            }
        }
    }
}

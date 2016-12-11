package com.lixiang.studyThread;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * Created by lixiang on 9/5/2016.
 */
public class ThreadAll {
    public static void main(String[] args) {
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        //不需要获取同步的monitor,Synchroizer信息，只需要线程和线程堆栈的信息
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false,false);
        for (ThreadInfo threadInfo : threadInfos) {
            System.out.println(threadInfo.getThreadId()+" : "+threadInfo.getThreadName());
        }
    }
}

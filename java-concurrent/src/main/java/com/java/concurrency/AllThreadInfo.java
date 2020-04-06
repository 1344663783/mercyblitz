package com.java.concurrency;

import com.sun.management.ThreadMXBean;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;

public class AllThreadInfo {
    public static void main(String[] args) {
        /**
         * 如何获取线程资源消费情况
         */
        ThreadMXBean threadMXBean = (ThreadMXBean) ManagementFactory.getThreadMXBean();
        long[] allThreadIds = threadMXBean.getAllThreadIds();
        for (long threadId : allThreadIds){
            ThreadInfo threadInfo = threadMXBean.getThreadInfo(threadId);
            System.out.println(threadInfo.toString());
            long bytes = threadMXBean.getThreadAllocatedBytes(threadId);
            long kBytes = bytes /1024;
            System.out.printf("线程[ID:%d] 分配内存： %s KB\n",threadId,kBytes);
        }
    }
}

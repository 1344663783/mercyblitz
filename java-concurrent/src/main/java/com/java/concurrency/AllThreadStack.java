package com.java.concurrency;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class AllThreadStack {
    public static void main(String[] args) {
        /**
         * 如何获取当前JVM 所有线程
         */
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        long[] allThreadIds = threadMXBean.getAllThreadIds();
        for (long threadId : allThreadIds){
            ThreadInfo threadInfo = threadMXBean.getThreadInfo(threadId);
            System.out.println(threadInfo.toString());
        }
    }
}

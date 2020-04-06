package com.java.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorQuestion{
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(()->{
            throw new RuntimeException("数据达到阈值");
        });
        //等待一秒钟，确保提交的任务完成
        executorService.awaitTermination(1, TimeUnit.SECONDS);
        executorService.shutdown();
    }

}

package com.java.concurrency.barrier;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchQuestion {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(5);
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i=0; i<5; i++){
            executorService.submit(()->{
                action();
                latch.countDown();
            });
        }

        //等待完成
        //当计数 > 0 ,会被阻塞
        latch.await();

        System.out.println("DONE");
        //关闭线程池
        executorService.shutdown();

    }

    private static void action() {
        System.out.println("线程[%s] 正在执行："+ Thread.currentThread().getName());
    }
}

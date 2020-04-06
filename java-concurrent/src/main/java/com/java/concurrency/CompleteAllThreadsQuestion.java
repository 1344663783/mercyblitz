package com.java.concurrency;

public class CompleteAllThreadsQuestion {
    public static void main(String[] args) throws InterruptedException {
        // main 线程 -> 子线程
        Thread t1 = new Thread(CompleteAllThreadsQuestion::action, "t1");
        Thread t2 = new Thread(CompleteAllThreadsQuestion::action, "t1");
        Thread t3 = new Thread(CompleteAllThreadsQuestion::action, "t1");

        //不确定t1 t2 t3是否调用start()

        //创建了 N Thread

        Thread mainThread = Thread.currentThread();
        //获取 main 线程组
        ThreadGroup threadGroup = mainThread.getThreadGroup();
        //活跃的线程数
        int i = threadGroup.activeCount();
        Thread[] threads = new Thread[i];
        //把所有的线程复制到threads 数组
        threadGroup.enumerate(threads,true);

        for (Thread thread : threads){
            if (Thread.State.NEW.equals(thread.getState())){
                thread.start();
                thread.join();
            }
        }
    }

    private static void action(){
        System.out.printf("线程[%s] 正在执行...\n ",Thread.currentThread().getName());
    }
}

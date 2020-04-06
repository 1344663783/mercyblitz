package com.java.concurrency;

public class HowToStopThread {

    public static void main(String[] args) throws InterruptedException {
        Action action = new Action();
        //子线程
        Thread t1 = new Thread(action, "t1");
        t1.start();
        //改变action stopped 状态
        action.setStopped(true);
        t1.join();

        Thread t2 = new Thread(()->{
            if (!Thread.currentThread().isInterrupted()){
                action();
            }
        },"t2");

        t2.start();
        //中断操作 （仅仅设置状态，而非中止线程）
        t2.interrupt();
        t2.join();
    }

    private static class Action implements Runnable{
        //线程安全问题，确保可见性
        private boolean stopped = false;
        @Override
        public void run() {
            if (!stopped){
                //执行动作
                action();
            }
        }

        public void setStopped(boolean stopped) {
            this.stopped = stopped;
        }


    }

    private static void action() {
        System.out.println(Thread.currentThread().getName());
    }

    //java 为什么要放弃Thread 的stop方法
    //可能会改变状态 导致死锁

    // 请说明 Thread interrupt(),isInterrupt,interrupted()
}

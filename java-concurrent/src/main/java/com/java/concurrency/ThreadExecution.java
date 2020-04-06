package com.java.concurrency;

/**
 * 线程顺序执行
 */
public class ThreadExecution {

    public static void main(String[] args) throws InterruptedException {
//        threadSleep();
//        threadLoop();

    }

    private static void threadStartAndWait() throws InterruptedException {
        Thread t1 = new Thread(ThreadExecution::action,"t1");
        Thread t2 = new Thread(ThreadExecution::action,"t2");
        Thread t3 = new Thread(ThreadExecution::action,"t3");
        threadDoWait(t1);
        threadDoWait(t2);
        threadDoWait(t3);

    }

    private static void threadDoWait(Thread thread) throws InterruptedException {
        if (Thread.State.NEW.equals(thread.getState())){
            thread.start();
        }
        while(thread.isAlive()){
            synchronized (thread){
                thread.wait();  //谁唤醒了它 //notify（）
            }
        }
    }

    private static void threadSleep() throws InterruptedException {
        Thread t1 = new Thread(ThreadExecution::action,"t1");
        Thread t2 = new Thread(ThreadExecution::action,"t2");
        Thread t3 = new Thread(ThreadExecution::action,"t3");
        t1.start();
        while (t1.isAlive()){
            //自旋 Spin
            Thread.sleep(0);
        }
        t2.start();
        while (t2.isAlive()){
            Thread.sleep(0);
        }
        t3.start();
        while (t3.isAlive()){
            Thread.sleep(0);
        }

    }


    private static void threadLoop() throws InterruptedException {
        Thread t1 = new Thread(ThreadExecution::action,"t1");
        Thread t2 = new Thread(ThreadExecution::action,"t2");
        Thread t3 = new Thread(ThreadExecution::action,"t3");
        t1.start();
        while (t1.isAlive()){
            //自旋 Spin
        }
        t2.start();
        while (t2.isAlive()){
        }
        t3.start();
        while (t3.isAlive()){
        }

    }

    private static void threadJoin() throws InterruptedException {
        Thread t1 = new Thread(ThreadExecution::action,"t1");
        Thread t2 = new Thread(ThreadExecution::action,"t2");
        Thread t3 = new Thread(ThreadExecution::action,"t3");
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
    }

    public static void action(){
        System.out.println(Thread.currentThread().getName());
    }
}

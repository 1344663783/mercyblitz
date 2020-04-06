package com.java.concurrency;

public class ThreadState {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {

        }, "线程1 ");

        thread.start();

        System.out.println(thread.getName()+thread.isAlive());
    }
}

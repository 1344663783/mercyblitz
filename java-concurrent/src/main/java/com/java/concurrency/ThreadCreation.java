package com.java.concurrency;

public class ThreadCreation {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
        },"子线程1");
    }

    /**
     * 不推荐使用扩展的方式
     */
    public static class MyThread extends Thread {
        /**
         * 多态的方式
         */
        @Override
        public void run(){
            super.run();
        }
    }


}

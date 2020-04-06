package com.java.concurrency;

import java.io.IOException;

public class ProcessCreation {
    /**
     * Java 如何创建进程
     * @param args
     */
    public static void main(String[] args) throws IOException {
        //获取 Java runtime
        Runtime runtime = Runtime.getRuntime();
        Process process =  runtime.exec("calc");
        process.exitValue();
    }
}

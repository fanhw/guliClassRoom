package com.fhw.guliclassroom.common.practice.thread.ThreadPoolDemo;

import com.fhw.guliclassroom.common.practice.thread.ThreadPoolDemo.WorkerThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-02-01 09:35
 */


public class SimpleThreadPool {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            Runnable workerThread = new WorkerThread("" + i);
            executor.execute(workerThread);
        }
        executor.shutdown();
        while (!executor.isTerminated()) {

        }
        System.out.println("Finished all threads");

    }
}

package com.fhw.guliclassroom.common.practice.thread.ThreadPoolDemo;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-02-01 09:43
 */


public class MyMonitorThread implements Runnable {

    private ThreadPoolExecutor executor;

    private int seconds;

    private boolean run = true;



    public MyMonitorThread(ThreadPoolExecutor threadPoolExecutor, int seconds) {
        this.executor = threadPoolExecutor;
        this.seconds = seconds;
    }

    public void shutdown() {
        this.run = false;
    }

    @Override
    public void run() {
        while (run) {
            System.out.println(
                    String.format("[monitor] [%d/%d] Active: %d, Completed: %d, Task: %d, isShutdown: %s, isTerminated: %s",
                            this.executor.getPoolSize(),
                            this.executor.getCorePoolSize(),
                            this.executor.getActiveCount(),
                            this.executor.getCompletedTaskCount(),
                            this.executor.getTaskCount(),
                            this.executor.isShutdown(),
                            this.executor.isTerminated()));
            try {
                Thread.sleep(seconds * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

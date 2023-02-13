package com.fhw.guliclassroom.common.practice.config;

import lombok.Setter;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadPoolExecutor;


/**
 * @author fhw
 * @version 1.0
 * @date 2023-02-02 10:06
 */


public class UserMonitorThread implements Runnable {
    private ThreadPoolTaskExecutor threadPoolTaskExecutor;

    private int seconds;

    private boolean run = true;

    @Setter
    private ThreadPoolExecutor executor;


    public UserMonitorThread(ThreadPoolTaskExecutor threadPoolExecutor, int seconds) {
        this.threadPoolTaskExecutor = threadPoolExecutor;
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

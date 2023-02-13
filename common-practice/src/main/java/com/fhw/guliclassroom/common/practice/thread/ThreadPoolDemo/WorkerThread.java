package com.fhw.guliclassroom.common.practice.thread.ThreadPoolDemo;

import java.util.concurrent.Callable;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-01-31 15:33
 */


public class WorkerThread implements Runnable {

    private String command;

    public WorkerThread(String s) {
        this.command = s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Start. Command = " + command);
        processCommand();
        System.out.println(Thread.currentThread().getName() + " End.");
    }


    private void processCommand() {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return this.command;
    }
}

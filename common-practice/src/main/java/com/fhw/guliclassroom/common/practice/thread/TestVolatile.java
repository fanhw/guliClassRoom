package com.fhw.guliclassroom.common.practice.thread;

import java.util.concurrent.TimeUnit;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-01-30 22:28
 */


public class TestVolatile {

    private static volatile boolean stop = false;

    public static void main(String[] args) {
        new Thread("Thread A") {
            @Override
            public void run() {
                while (!stop) {

                }
                System.out.println(Thread.currentThread() + " stopped");
            }
        }.start();
        try {
            TimeUnit.SECONDS.sleep(1);
            System.out.println(Thread.currentThread() + " after 1 seconds");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        stop = true;
    }
}

package com.fhw.guliclassroom.common.practice.thread;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-01-31 14:05
 */


public class MyThread extends Thread{
    @Override
    public void run() {
        synchronized (this){
            System.out.println("before notify");
            notify();
            System.out.println("after notify");
        }
    }
}

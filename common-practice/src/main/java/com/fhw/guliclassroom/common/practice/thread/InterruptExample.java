package com.fhw.guliclassroom.common.practice.thread;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-01-30 11:38
 */


public class InterruptExample {
    private static class MyThread1 extends Thread {
        @Override
        public void run() {
            try {
                Thread.sleep(1);
                System.out.println("Thread run");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();
        myThread1.join();
        myThread1.interrupt();
        System.out.println("Main run");
    }
}

package com.fhw.guliclassroom.common.practice.thread.Jmm;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-02-17 20:47
 */
public class Visibility {
    static volatile boolean run = true;

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            while (run) {
                //  System.out.println("hello world");
            }
        });
        t.start();
        Thread.sleep(10000);
        // 线程t不会如预想的停下来
        run = false;
    }

}

package com.fhw.guliclassroom.common.practice.thread;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-02-17 20:21
 */

public class Deadlock {
    static Beer beer = new Beer();
    static Story story = new Story();

    public static void main(String[] args) {
        new Thread(() -> {
            synchronized (beer) {
                System.out.println("我有酒，给我故事");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (story) {
                    System.out.println("小王开始喝酒讲故事");
                }
            }
        }, "小王").start();

        new Thread(() -> {
            synchronized (story) {
                System.out.println("我有故事，给我酒");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (beer) {
                    System.out.println("老王开始喝酒讲故事");
                }
            }
        }, "老王").start();
        System.out.println("=============");
    }

    static class Beer {

    }

    static class Story {

    }
}

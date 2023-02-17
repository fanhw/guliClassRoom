package com.fhw.guliclassroom.common.practice.thread;


/**
 * @author fhw
 * @version 1.0
 * @date 2023-02-17 19:26
 */


public class ThreadDaemonDemo {

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new MyThread(), "线程");
        // 此线程在后台运行
        t.setDaemon(true);
        System.out.println("线程 t 是否是守护进程：" + t.isDaemon());
        t.start(); // 启动线程
        Thread.sleep(5000);
        System.out.println("t.getName() = " + t.getName());
    }


    static class MyThread implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + "在运行。");
            }
          //  return;
        }
    }
}

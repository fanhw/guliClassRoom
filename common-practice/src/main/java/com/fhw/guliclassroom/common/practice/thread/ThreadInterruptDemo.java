package com.fhw.guliclassroom.common.practice.thread;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-02-17 18:10
 */


public class ThreadInterruptDemo {

    public static void main(String[] args) {
        // 实例化Runnable实现类的对象
        MyThread mt = new MyThread();
        // 实例化Thread对象
        Thread t = new Thread(mt, "线程");
        t.start(); // 启动线程
        try {
            // 主线程休眠2秒
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("主线程休眠被终止");
        }
        // 中断 mt 线程的执行
        t.interrupt();
    }

    static class MyThread implements Runnable {
        @Override
        public void run() {

            System.out.println("1、进入run()方法");
            try {
                // 线程休眠10秒
                Thread.sleep(10000);
                System.out.println("2、已经完成了休眠");
            } catch (InterruptedException e) {
                System.out.println("3、MyThread线程休眠被终止");
                // 返回调用处
                return;
            }
            System.out.println("4、run()方法正常结束");
        }
    }
}

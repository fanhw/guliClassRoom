package com.fhw.guliclassroom.common.practice.thread;

import org.jetbrains.annotations.NotNull;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-01-30 22:56
 */


public class FinalDemo {
    private final int a;  //普通域
    private final int b; //final域
    private static volatile FinalDemo finalDemo;

    public FinalDemo() {
        a = 1; // 1. 写普通域
        b = 2; // 2. 写final域
    }

    public static void writer() {
        finalDemo = new FinalDemo();
    }

    public static void reader() {
        FinalDemo demo = finalDemo; // 3.读对象引用
        int a = demo.a;    //4.读普通域
        System.out.println(a);
        int b = demo.b;    //5.读final域
        System.out.println(b);
    }

    private class A extends Thread {

        public A(@NotNull String name) {
            super(name);
        }

        @Override
        public void run() {
            writer();
            System.out.println("AAAAAAA");
        }

    }

    private class B extends Thread {
        public B(@NotNull String name) {
            super(name);
        }

        @Override
        public void run() {
            reader();
            System.out.println("BBBBBBBB");
        }
    }

    public void test() {
        FinalDemo.A a = new FinalDemo.A("A");
        FinalDemo.B b = new FinalDemo.B("B");
        a.start();
        b.start();
    }

    public static void main(String[] args) {
        FinalDemo finalDemo = new FinalDemo();
        finalDemo.test();
    }

}

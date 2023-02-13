package com.fhw.guliclassroom.common.practice.thread;

import org.jetbrains.annotations.NotNull;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-01-31 12:11
 */


public class CASDemo {
    private int i = 0;
    private int j;

    public int add() {
        return j = ++i;
    }

    private class A extends Thread {

        public A(@NotNull String name) {
            super(name);
        }

        @Override
        public void run() {
            int add = add();
            System.out.println("AAAAAAA" + add);
        }

    }

    private class B extends Thread {
        public B(@NotNull String name) {
            super(name);
        }

        @Override
        public void run() {
            int add = add();
            System.out.println("BBBBBBBB" + add);
        }
    }

    private class C extends Thread {

        public C(@NotNull String name) {
            super(name);
        }

        @Override
        public void run() {
            int add = add();
            System.out.println("CCCCCCCC" + add);
        }

    }


    public void test() {
        CASDemo.A a = new CASDemo.A("A");
        CASDemo.B b = new CASDemo.B("B");
        CASDemo.C c = new CASDemo.C("C");
        a.start();
        b.start();
        c.start();

    }

    public static void main(String[] args) {
        CASDemo casDemo = new CASDemo();
        casDemo.test();
    }


}

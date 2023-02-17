package com.fhw.guliclassroom.common.practice.thread;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-02-17 19:54
 */

@Slf4j
@NoArgsConstructor
public class Lock {
    private static final ReentrantLock LOCK = new ReentrantLock();

    public static void main(String[] args) {
        //Lock lock = new Lock();
        Lock.m();
    }

    private static void m() {
        LOCK.lock();
        try {
            log.info("begin");
            // 调用m1()
            m1();
        } finally {
            // 注意锁的释放
            LOCK.unlock();
        }
    }

    public static void m1() {
        LOCK.lock();
        try {
            log.info("m1");
            m2();
        } finally {
            // 注意锁的释放
            LOCK.unlock();
        }
    }

    public static void m2() {
        LOCK.lock();
        try {
            log.info("m2");
            // m2();
        } finally {
            // 注意锁的释放
            LOCK.unlock();
        }
    }
}

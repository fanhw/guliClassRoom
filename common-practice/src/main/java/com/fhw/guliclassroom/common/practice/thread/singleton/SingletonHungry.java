package com.fhw.guliclassroom.common.practice.thread.singleton;


/**
 * @author fhw
 * @version 1.0
 * @date 2023-02-17 18:18
 */

public class SingletonHungry {
    private static SingletonHungry instance = new SingletonHungry();


    private SingletonHungry() {

    }

    public static SingletonHungry getInstance() {
        return instance;
    }
}

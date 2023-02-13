package com.fhw.guliclassroom.common.practice.cglib;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-02-13 16:19
 */


public class Main {
    public static void main(String[] args) {
        CGLibDemo.CGLibProxy cgLibProxy = new CGLibDemo.CGLibProxy();
        //获取动态代理类实例
        CGLibDemo.Sister proxySister = (CGLibDemo.Sister) cgLibProxy.getInstance(new CGLibDemo.Sister());
        System.out.println("CGLib Dynamic object name: " + proxySister.getClass().getName());
        proxySister.sing();
    }
}

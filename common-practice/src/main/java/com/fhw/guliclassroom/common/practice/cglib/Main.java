package com.fhw.guliclassroom.common.practice.cglib;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-02-13 16:19
 */


public class Main {


    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }
        list.stream().forEach(System.out::println);
    }
}

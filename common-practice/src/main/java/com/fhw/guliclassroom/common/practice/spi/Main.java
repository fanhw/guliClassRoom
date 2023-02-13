package com.fhw.guliclassroom.common.practice.spi;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-01-30 10:31
 */


public class Main {
    public static void main(String[] args) {
        ServiceLoader<Search> load = ServiceLoader.load(Search.class);
        Iterator<Search> iterator = load.iterator();
        while (iterator.hasNext()) {
            Search next = iterator.next();
            next.searchDoc("hello world");
        }
    }
}

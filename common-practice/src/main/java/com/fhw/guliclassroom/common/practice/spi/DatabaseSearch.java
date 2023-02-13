package com.fhw.guliclassroom.common.practice.spi;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-01-30 10:30
 */


public class DatabaseSearch implements Search {
    @Override
    public void searchDoc(String keyword) {
        System.out.println("数据搜索 " + keyword);
    }
}

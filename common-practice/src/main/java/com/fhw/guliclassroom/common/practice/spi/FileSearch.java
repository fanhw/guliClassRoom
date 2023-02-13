package com.fhw.guliclassroom.common.practice.spi;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-01-30 10:29
 */


public class FileSearch implements Search {

    @Override
    public void searchDoc(String keyword) {
        System.out.println("文件搜索 " + keyword);
    }
}

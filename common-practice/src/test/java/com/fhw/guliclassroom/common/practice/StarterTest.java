package com.fhw.guliclassroom.common.practice;

import com.fhw.guliclassroom.common.practice.starter.DemoModule;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-02-13 16:59
 */

@SpringBootTest
public class StarterTest {

    @Autowired
    private DemoModule demoModule;

    @Test
    public void test() {
        System.out.println("demoModule = " + demoModule);
        System.out.println("hello world");
    }
}

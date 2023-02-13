package com.fhw.guliclassroom.common.practice;

import com.fhw.guliclassroom.common.practice.rebuildstrategy.AddOperation;
import com.fhw.guliclassroom.common.practice.rebuildstrategy.DivideOperation;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-02-13 15:58
 */

@SpringBootTest
public class ReBuildStrategyTest {

    @Autowired
    private AddOperation addOperation;

    @Autowired
    private DivideOperation divideOperation;

    @Test
    public void test() {
        int apply = addOperation.apply(10, 2);
        System.out.println("apply = " + apply);
        int apply1 = divideOperation.apply(10, 2);
        System.out.println("apply1 = " + apply1);
        System.out.println("hello world");
    }


}

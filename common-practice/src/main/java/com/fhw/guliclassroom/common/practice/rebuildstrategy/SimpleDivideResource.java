package com.fhw.guliclassroom.common.practice.rebuildstrategy;

import org.springframework.stereotype.Component;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-02-13 15:52
 */

@Component(value = "simpleDivideResource")
public class SimpleDivideResource implements Resource {
    @Override
    public int process(int a, int b) {
        return a / b;
    }
}

package com.fhw.guliclassroom.common.practice.rebuildstrategy;

import org.springframework.stereotype.Component;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-02-13 15:51
 */

@Component(value ="simpleAddResource")
public class SimpleAddResource implements Resource {
    @Override
    public int process(int a, int b) {
        return a + b;
    }
}

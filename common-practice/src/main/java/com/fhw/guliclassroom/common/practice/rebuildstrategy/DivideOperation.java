package com.fhw.guliclassroom.common.practice.rebuildstrategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-02-13 15:55
 */

@Component
public class DivideOperation implements Operation {
    @Autowired
    private SimpleDivideResource simpleDivideResource;

    @Override
    public int apply(int a, int b) {
        return simpleDivideResource.process(a, b);
    }
}

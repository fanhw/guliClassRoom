package com.fhw.guliclassroom.common.practice.rebuildstrategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-02-13 15:47
 */

@Component
public class AddOperation implements Operation {
    @Autowired
    private SimpleAddResource simpleAddResource;
    @Override
    public int apply(int a, int b) {
        return simpleAddResource.process(a,b);
    }
}

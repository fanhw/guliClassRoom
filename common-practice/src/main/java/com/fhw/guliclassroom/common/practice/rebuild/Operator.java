package com.fhw.guliclassroom.common.practice.rebuild;


import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-02-13 11:39
 */

@AllArgsConstructor
public enum Operator {
    ADD("add"), DIVIDE("divide");
    @Getter
    private String description;

}

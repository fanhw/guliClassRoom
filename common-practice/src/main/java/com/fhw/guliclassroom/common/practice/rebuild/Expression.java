package com.fhw.guliclassroom.common.practice.rebuild;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-02-13 11:38
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Expression {
    private Integer x;
    private Integer y;
    private Operator operator;
}

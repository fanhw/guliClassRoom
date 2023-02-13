package com.fhw.guliclassroom.common.practice.rebuild;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-02-13 11:37
 */


public interface Rule {
    boolean evaluate(Expression expression);

    Result getResult();

}

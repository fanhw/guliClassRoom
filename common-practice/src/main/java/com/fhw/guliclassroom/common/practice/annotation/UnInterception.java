package com.fhw.guliclassroom.common.practice.annotation;

import java.lang.annotation.*;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-02-21 23:03
 */

@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface UnInterception {
}

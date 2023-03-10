package com.fhw.guliclassroom.common.practice.annotation;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import java.lang.annotation.*;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-02-19 19:40
 */

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface ExcludeComponent {
}

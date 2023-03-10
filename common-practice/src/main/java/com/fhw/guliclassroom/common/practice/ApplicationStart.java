package com.fhw.guliclassroom.common.practice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-01-19 11:00
 */
@SpringBootApplication
@MapperScan("com.fhw.guliclassroom.common.practice.mapper")
//@ComponentScan(excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = ExcludeComponent.class)})
public class ApplicationStart {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationStart.class, args);
    }
}

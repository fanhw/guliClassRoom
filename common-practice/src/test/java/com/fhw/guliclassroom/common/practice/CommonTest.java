package com.fhw.guliclassroom.common.practice;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-02-17 11:49
 */
@SpringBootTest
public class CommonTest {
    @Test
    public void joinTest() {
        // System.out.println("hello");
        String s1 = "08:00,09:00";
        String s2 = "";
        String s3 = "20:00,21:00";
        String collect = Arrays.asList(s1, s2, s3).stream().filter(StringUtils::isNotBlank)
                .collect(Collectors.joining(","));
        System.out.println("collect = " + collect);
    }
}

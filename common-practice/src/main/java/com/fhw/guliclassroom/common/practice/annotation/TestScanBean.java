package com.fhw.guliclassroom.common.practice.annotation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-02-19 19:41
 */

@Service
@Data
@AllArgsConstructor
@NoArgsConstructor
@ExcludeComponent
public class TestScanBean {
    private String name;
    private String age;
}

package com.fhw.guliclassroom.common.practice.starter;

import lombok.Data;
import lombok.ToString;
import org.springframework.context.annotation.Bean;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-02-13 16:48
 */

@Data
@ToString
public class DemoModule {
    private String version;
    private String name;

}

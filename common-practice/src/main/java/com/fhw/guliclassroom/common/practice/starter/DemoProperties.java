package com.fhw.guliclassroom.common.practice.starter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-02-13 16:44
 */


@Data
@ConfigurationProperties(prefix = "com.fhw")
public class DemoProperties {
    private String version;
    private String name;
}

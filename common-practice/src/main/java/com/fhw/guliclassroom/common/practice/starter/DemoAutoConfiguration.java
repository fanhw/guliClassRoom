package com.fhw.guliclassroom.common.practice.starter;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-02-13 16:47
 */


@Configuration
@EnableConfigurationProperties(DemoProperties.class)
public class DemoAutoConfiguration {
    @Bean
    public DemoModule demoModule(DemoProperties properties) {
        DemoModule demoModule = new DemoModule();
        demoModule.setName(properties.getName());
        demoModule.setVersion(properties.getVersion());
        return demoModule;
    }
}

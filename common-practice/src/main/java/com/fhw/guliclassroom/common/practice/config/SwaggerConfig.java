package com.fhw.guliclassroom.common.practice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-02-19 23:00
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig  {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //指定扫描的包路径
                .apis(RequestHandlerSelectors.basePackage("com.fhw.guliclassroom.common.practice.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * 构建api文档的详细信息
     *
     * @return
     */
    private ApiInfo apiInfo() {
        //  作者信息
        Contact contact = new Contact("继耀", "https://www.baidu.com", "fanhaowena@163.com");
        return new ApiInfoBuilder()
               .contact(contact)
                .title("API文档")
                .description("用restful风格的接口")
                .termsOfServiceUrl("https://www.baidu.com")
                .version("3.0")
                .build();
    }


}

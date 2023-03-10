package com.fhw.guliclassroom.common.practice.controller;

import com.fhw.guliclassroom.common.practice.annotation.UnInterception;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-02-21 22:51
 */

@RestController
@RequestMapping("/interceptor")
public class InterceptorController {
    @RequestMapping("/test")
    @UnInterception
    public String test() {
        return "hello";
    }
}

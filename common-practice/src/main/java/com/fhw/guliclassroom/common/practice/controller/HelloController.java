package com.fhw.guliclassroom.common.practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-01-19 11:07
 */

@RestController
public class HelloController {


    @GetMapping("/hello")
    public String getWelcome() {
        return " happy new year";
    }
}

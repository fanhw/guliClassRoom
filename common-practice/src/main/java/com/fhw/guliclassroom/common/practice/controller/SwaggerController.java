package com.fhw.guliclassroom.common.practice.controller;

import com.fhw.guliclassroom.common.practice.entity.Authentication;
import com.fhw.guliclassroom.common.practice.utils.JsonResult;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-02-21 10:24
 */
@RestController
@RequestMapping("/swagger")
@Api(tags = "Swagger2 document")
public class SwaggerController {
    @GetMapping("/get/{id}")
    @ApiOperation(value = "根据用户唯一标识获取用户信息")
    public JsonResult getUserInfo(@PathVariable  Long id) {
        // 模拟数据库中根据id获取User信息
        Authentication authentication = new Authentication(id, "倪升武", "123456");
        return new JsonResult(authentication);
    }
    @PostMapping("/insert")
    @ApiOperation(value = "添加用户信息")
    public JsonResult insertUser(@RequestBody @ApiParam(value = "用户信息") Authentication authentication) {
        // 处理添加逻辑
        return new JsonResult<>(authentication);
    }
}

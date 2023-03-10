package com.fhw.guliclassroom.common.practice.controller;

import com.fhw.guliclassroom.common.practice.entity.Authentication;
import com.fhw.guliclassroom.common.practice.enums.BusinessMsgEnum;
import com.fhw.guliclassroom.common.practice.exception.BusinessErrorException;
import com.fhw.guliclassroom.common.practice.utils.JsonResult;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-02-21 10:43
 */

@RestController
@RequestMapping("/exception")
@Api(tags = "GlobalExceptionHandler Controller")
public class ExceptionController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionController.class);

    @PostMapping("/test")
    @ApiOperation("测试用户名或者密码缺少一")
    public JsonResult test(@RequestParam("name") @ApiParam(value = "用户名") String name,
                           @RequestParam("pass") @ApiParam(value = "密码") String pass,
                           @RequestParam(value = "id", required = false) @ApiParam(value = "用户id", defaultValue = "123456") Long id) {
        LOGGER.info("name：{}", name);
        LOGGER.info("pass：{}", pass);
        Authentication authentication = new Authentication();
        if (Objects.isNull(id)) {
            authentication.setUserName(name);
            authentication.setPassword(pass);
        } else {
            authentication.setId(id);
            authentication.setUserName(name);
            authentication.setPassword(pass);
        }
        return new JsonResult(authentication);
    }

    @PostMapping("/testUser")
    @ApiOperation("测试用户名或者密码缺少一个")
    public JsonResult testUser(@RequestBody(required = false) Authentication authentication) {
        LOGGER.info("name：{}", authentication.getUserName());
        LOGGER.info("pass：{}", authentication.getPassword());
        Authentication result = new Authentication();
        if (Objects.isNull(authentication.getId())) {
            result.setUserName(authentication.getUserName());
            result.setPassword(authentication.getPassword());
        } else {
            result.setId(authentication.getId());
            result.setUserName(authentication.getUserName());
            result.setPassword(authentication.getPassword());
        }
        return new JsonResult(result);
    }

    @GetMapping("/business")
    public JsonResult testException() {
        try {
            int i = 1 / 0;
        } catch (Exception e) {
            throw new BusinessErrorException(BusinessMsgEnum.SERVICE_TIME_OUT);
        }
        return JsonResult.fail();
    }
}

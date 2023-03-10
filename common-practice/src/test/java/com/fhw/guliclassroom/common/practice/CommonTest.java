package com.fhw.guliclassroom.common.practice;

import com.alibaba.fastjson.JSON;
import com.fhw.guliclassroom.common.practice.entity.User;
import com.fhw.guliclassroom.common.practice.redis.RedisService;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-02-17 11:49
 */
@SpringBootTest
public class CommonTest {
    private static final Logger logger = LoggerFactory.getLogger(CommonTest.class);

    @Test
    public void joinTest() {


    }

    @Resource
    private RedisService redisService;

    @Test
    public void contextLoads() {
        //测试redis的string类型
        redisService.setString("weichat", "程序员私房菜");
        logger.info("我的微信公众号为：{}", redisService.getString("weichat"));

        // 如果是个实体，我们可以使用json工具转成json字符串，
        User user = new User("1111", "fhw", 18, "123456");
        redisService.setString("userInfo", JSON.toJSONString(user));
        logger.info("用户信息：{}", redisService.getString("userInfo"));
    }


}

package com.fhw.guliclassroom.common.practice.controller;

import com.fhw.guliclassroom.common.practice.entity.Authentication;
import com.fhw.guliclassroom.common.practice.entity.User;
import com.fhw.guliclassroom.common.practice.service.UserService;
import com.fhw.guliclassroom.common.practice.utils.JsonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-01-19 11:07
 */

@RestController
@RequestMapping("/common")
public class HelloController {


    private final static Logger LOGGER = LoggerFactory.getLogger(HelloController.class);


    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String getWelcome() {
        return " happy new year";
    }

    @GetMapping("/map")
    public JsonResult getMap() {
        Map<String, Object> map = new HashMap<>(3);
        User user = new User("1", "fhw", 18, "fanhaowena@163.com");
        map.put("作者信息", user);
        map.put("博客地址", "http://blog.itcodai.com");
        map.put("掘金地址", null);
        map.put("粉丝数量", 4153);
        return new JsonResult<>(map, "获取用户map成功");
    }

    @RequestMapping("/log")
    public String testLog() {
        LOGGER.debug("=====测试日志debug级别打印====");
        LOGGER.info("======测试日志info级别打印=====");
        LOGGER.error("=====测试日志error级别打印====");
        LOGGER.warn("======测试日志warn级别打印=====");
        LOGGER.trace("======测试日志trace级别打印=====");

        // 可以使用占位符打印出一些参数信息
        String str1 = "blog.itcodai.com";
        String str2 = "blog.csdn.net/eson_15";
        LOGGER.info("======倪升武的个人博客：{}；倪升武的CSDN博客：{}", str1, str2);
        return "success";
    }


    @PostMapping("/form1")
    public JsonResult testForm(@RequestBody(required = false) Authentication authentication) {
        System.out.println("获取到的username为：" + authentication.getUserName());
        System.out.println("获取到的password为：" + authentication.getPassword());
        return JsonResult.success(authentication);
    }

    @GetMapping("/customEvent")
    public String publishCustomEvent() {
        User user2 = userService.getUser2();
        LOGGER.info("user:{}", user2);
        return "success";
    }


    /**
     * 获取当前在线人数，该方法有bug
     *
     * @param request
     * @return
     */
    @GetMapping("/total")
    public String getTotalUser(HttpServletRequest request, HttpServletResponse response) {
        Cookie cookie;
        try {
            // 把sessionId记录在浏览器中
            cookie = new Cookie("JSESSIONID", URLEncoder.encode(request.getSession().getId(), "utf-8"));
            cookie.setPath("/");
            //设置cookie有效期为2天，设置长一点
            cookie.setMaxAge(48 * 60 * 60);
            response.addCookie(cookie);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        Integer count = (Integer) request.getSession().getServletContext().getAttribute("count");
        return "当前在线人数：" + count;
    }


}

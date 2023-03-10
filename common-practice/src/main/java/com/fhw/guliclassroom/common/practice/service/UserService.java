package com.fhw.guliclassroom.common.practice.service;


import com.fhw.guliclassroom.common.practice.entity.User;
import com.fhw.guliclassroom.common.practice.event.CustomEvent;
import com.fhw.guliclassroom.common.practice.mapper.UserMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Set;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-02-21 20:30
 */

@Service
public class UserService {

    @Resource
    private ApplicationContext applicationContext;

    public User getUser2() {
        User user = new User("9527", "倪升武", 18, "123456");
        // 发布事件
        CustomEvent customEvent = new CustomEvent(this, user);
        applicationContext.publishEvent(customEvent);
        return user;
    }


    @Resource
    private UserMapper userMapper;


    public com.fhw.guliclassroom.common.practice.model.User getByUsername(String username) {
        return userMapper.getByUsername(username);
    }

    public Set<String> getRoles(String username) {
        return userMapper.getRoles(username);
    }

    public Set<String> getPermissions(String username) {
        return userMapper.getPermissions(username);
    }


}

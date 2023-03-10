package com.fhw.guliclassroom.common.practice.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fhw.guliclassroom.common.practice.model.User;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-01-20 10:49
 */

@Component
public interface UserMapper extends BaseMapper<User> {

    User getByUsername(String username);

    Set<String> getRoles(String username);

    Set<String> getPermissions(String username);
}

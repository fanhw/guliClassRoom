package com.fhw.guliclassroom.common.practice.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fhw.guliclassroom.common.practice.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-01-20 10:49
 */

@Component
public interface UserMapper extends BaseMapper<User> {
}

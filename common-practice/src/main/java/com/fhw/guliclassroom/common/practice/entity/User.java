package com.fhw.guliclassroom.common.practice.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-01-20 10:46
 */
@Data
public class User {
    @TableId(type = IdType.ASSIGN_ID)
    private String id;
    private String name;
    private Integer age;
    private String email;
}

package com.fhw.guliclassroom.common.practice.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-01-25 09:36
 */

@Data
@Accessors(chain = true)
@NoArgsConstructor
public class Student {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    private Integer age;
    @TableLogic
    private Integer deleted;

}

package com.fhw.guliclassroom.common.practice;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fhw.guliclassroom.common.practice.entity.Student;
import com.fhw.guliclassroom.common.practice.entity.User;
import com.fhw.guliclassroom.common.practice.mapper.StudentMapper;
import com.fhw.guliclassroom.common.practice.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-01-20 10:52
 */

@SpringBootTest
public class ApplicationTest {

    @Autowired
    @Qualifier("userMapper")
    private UserMapper userMapper;


    @Resource
    private StudentMapper studentMapper;

    @Test
    public void findAll() {
        List<Student> studentList = studentMapper.selectList(null);
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    @Test
    public void addUser() {
        Student student = new Student();
        student.setAge(12).setName("fhw2");
        int rows = studentMapper.insert(student);
        System.out.println("rows:" + rows);
        System.out.println(student);
    }

    @Test
    public void deleteStudent() {
        int rows = studentMapper.deleteById(3L);
        System.out.println(rows);
        studentMapper.deleteBatchIds(Arrays.asList(1L, 5L));
    }

    @Test
    public void findPage() {
        Page<Student> page = new Page<>(1, 3);
        Page<Student> studentPage = studentMapper.selectPage(page, null);
        studentPage.getRecords().forEach(System.out::println);
        System.out.println(studentPage.getCurrent());
        System.out.println(studentPage.getPages());
        System.out.println(studentPage.getSize());
        System.out.println(studentPage.getTotal());
        System.out.println(studentPage.hasNext());
        System.out.println(studentPage.hasPrevious());
    }
}


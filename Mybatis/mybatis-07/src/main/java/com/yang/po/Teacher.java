package com.yang.po;

import lombok.Data;

import java.util.List;

/**
 * @Description:
 * @Author: Yang.Guo
 * @Date: 2021/03/30/21:12
 */
@Data
public class Teacher {
    private int id;
    private String name;
    private List<Student> studentList;
}

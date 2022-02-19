package com.yang.po;

import lombok.Data;

/**
 * @Description:
 * @Author: Yang.Guo
 * @Date: 2021/03/30/21:10
 */
@Data
public class Student {
    private int id;
    private String name;

    private Teacher teacher;
}

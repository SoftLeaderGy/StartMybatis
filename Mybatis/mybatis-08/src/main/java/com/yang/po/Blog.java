package com.yang.po;

import lombok.Data;

import java.util.Date;

/**
 * @Description:
 * @Author: Yang.Guo
 * @Date: 2021/03/30/23:25
 */
@Data
public class Blog {
    private String id;
    private String title;
    private String author;
    private Date createTime;
    private int views;
}

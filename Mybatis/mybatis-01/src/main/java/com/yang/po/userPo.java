package com.yang.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @Author: Yang.Guo
 * @Date: 2021/03/20/8:31 PM
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class userPo {
    private int id;
    private String name;
    private String pwd;
}

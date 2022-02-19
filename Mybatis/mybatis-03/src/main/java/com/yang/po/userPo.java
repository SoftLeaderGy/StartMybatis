package com.yang.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

/**
 * @Description:
 * @Author: Yang.Guo
 * @Date: 2021/03/20/8:31 PM
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Alias("user")
public class userPo {
    private int id;
    private String name;
    private String password;
}

package com.yang.mapper;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import com.yang.po.userPo;

import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: Yang.Guo
 * @Date: 2021/03/20/8:36 PM
 */
public interface userMapper {
    List<userPo> getUserList();

    userPo getUserById(int id);

    Integer insertUser(userPo user);

    Integer deleteUser(int id);

    Integer upDateUser(userPo user);

    Integer insertUserByMap(Map<String,Object> map);

}

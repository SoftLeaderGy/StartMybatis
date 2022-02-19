package com.yang.mapper;

import com.yang.po.userPo;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Description:
 * @Author: Yang.Guo
 * @Date: 2021/03/20/8:36 PM
 */
public interface userMapper {
    @Select("select * from user")
    List<userPo> getUsers();

    @Select("select * from user where id = #{id}")
    userPo getUserById(@Param("id") int id);

    @Insert("insert into user (id,name,pwd) values(#{id},#{name},#{pwd})")
    Integer addUser(userPo userPo);

    @Delete("delete from user where id = #{id}")
    Integer delUser(@Param("id") int id);

    @Update("update user set name = #{name}, pwd = #{pwd} where id = #{id} ")
    Integer updateUser(@Param("id") int id,@Param("name") String name,@Param("pwd") String pwd);
}

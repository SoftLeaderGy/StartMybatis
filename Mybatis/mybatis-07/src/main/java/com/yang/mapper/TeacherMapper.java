package com.yang.mapper;

import com.yang.po.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description:
 * @Author: Yang.Guo
 * @Date: 2021/03/30/21:17
 */
public interface TeacherMapper {
    List<Teacher> getTeacherList();

    List<Teacher> getTeacher(@Param("tid")int id);

    List<Teacher> getTeacher2(@Param("tid") int id);
}

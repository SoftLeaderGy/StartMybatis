package com.yang.test;

import com.yang.mapper.userMapper;
import com.yang.po.userPo;
import com.yang.utils.MybatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Description:
 * @Author: Yang.Guo
 * @Date: 2021/03/20/8:43 PM
 */
public class mybatisTest {
    @Test
    public void test(){

        SqlSession sqlSession = MybatisUtils.getSqlSession();
        userMapper mapper = sqlSession.getMapper(userMapper.class);
        List<userPo> userList = mapper.getUserList();
        for (userPo user:userList) {
            System.out.println(user);
        }
    }
    @Test
    public void getUserByIdTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        userMapper mapper = sqlSession.getMapper(userMapper.class);
        userPo user = mapper.getUserById(3);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void getUserListByRowBounds(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        RowBounds rowBounds = new RowBounds(1,2);
        // 通过java代码层面实现分页
        List<userPo> selectList = sqlSession.selectList("com.yang.mapper.userMapper.getUserListByRowBounds", "null", rowBounds);
//        Object mapper = sqlSession.getMapper(userMapper.class);
//        List<userPo> userListByRowBounds = ((userMapper) mapper).getUserListByRowBounds();
        for (userPo user:selectList) {
            System.out.println(user);
        }
        sqlSession.close();

    }
}

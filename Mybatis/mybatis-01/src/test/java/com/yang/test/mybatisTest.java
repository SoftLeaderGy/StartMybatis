package com.yang.test;

import com.yang.mapper.userMapper;
import com.yang.po.userPo;
import com.yang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: Yang.Guo
 * @Date: 2021/03/20/8:43 PM
 */
public class mybatisTest {
//    @Test
//    public void test(){
//
//        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        userMapper mapper = sqlSession.getMapper(userMapper.class);
//        List<userPo> userList = mapper.getUserList();
//        for (userPo user:userList) {
//            System.out.println(user);
//        }
//    }
    @Test
    public void getUserByIdTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        userMapper mapper = sqlSession.getMapper(userMapper.class);
        userPo user = mapper.getUserById(3);
        System.out.println(user);
        sqlSession.close();
    }
    @Test
    public void insertUserTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        userMapper mapper = sqlSession.getMapper(userMapper.class);
        userPo userPo = new userPo();
        userPo.setId(10);
        userPo.setName("洋洋洋");
        userPo.setPwd("666");
        Integer integer = mapper.insertUser(userPo);
        if(integer > 0){
            sqlSession.commit();
        }
        sqlSession.close();
    }
    @Test
    public void deleteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        userMapper mapper = sqlSession.getMapper(userMapper.class);
        Integer integer = mapper.deleteUser(5);
        if (integer > 0) {
            sqlSession.commit();
        }
        sqlSession.close();
    }
    @Test
    public void upDateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        userMapper mapper = sqlSession.getMapper(userMapper.class);
        userPo userPo = new userPo(3,"李四","666");
        Integer integer = mapper.upDateUser(userPo);
        if(integer > 0){
            sqlSession.commit();
        }
        sqlSession.close();
    }
    @Test
    public void insertUserByMap(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        userMapper mapper = sqlSession.getMapper(userMapper.class);
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("mapId",7);
        map.put("mapPwd","000");
        Integer integer = mapper.insertUserByMap(map);
        if(integer > 0){
            sqlSession.commit();
        }
        sqlSession.close();
    }
}

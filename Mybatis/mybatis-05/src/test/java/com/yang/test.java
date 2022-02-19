package com.yang;

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
 * @Date: 2021/03/26/16:25
 */
public class test {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        userMapper mapper = sqlSession.getMapper(userMapper.class);
//        List<userPo> userPoList = mapper.getUsers();
//        for (userPo user:userPoList
//             ) {
//            System.out.println(user);
//        }
//        userPo user = mapper.getUserById(1);
//        System.out.println(user);

//        Integer i = mapper.addUser(new userPo(0, "hello", "222"));
//        System.out.println(i);

//        mapper.delUser(0);

        mapper.updateUser(0,"world","111");
    }
    @Test
    public void mapTest(){
        Map map = new HashMap<>();
        map.put(null,null);
        map.put(null,2);
        System.out.println(map.keySet());
        System.out.println(map.get(null));
        System.out.println(map.entrySet());
    }
}

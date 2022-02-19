package com.yang.mapper;

import com.yang.po.Blog;

import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: Yang.Guo
 * @Date: 2021/03/30/23:27
 */
public interface BlogMapper {
    //插入数据
    int addBlog(Blog blog);
    List<Blog> getBlogsIf(Map map);
    
    List<Blog> getBlogChoose(Map map);

    int updateBlog(Map map);

    List<Blog> selectBlogForeach(Map map);
}

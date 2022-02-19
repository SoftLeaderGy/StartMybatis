import com.yang.mapper.BlogMapper;
import com.yang.po.Blog;
import com.yang.utils.IDUtiles;
import com.yang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

/**
 * @Description:
 * @Author: Yang.Guo
 * @Date: 2021/03/30/23:30
 */
public class myTest {
    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId(IDUtiles.getId());
        blog.setAuthor("郭洋");
        blog.setTitle("Mybatis如此简单");
        blog.setCreateTime(new Date());
        blog.setViews(999);
        mapper.addBlog(blog);

        blog.setId(IDUtiles.getId());
        blog.setTitle("Spring如此简单");
        mapper.addBlog(blog);

        blog.setId(IDUtiles.getId());
        blog.setTitle("Java如此简单");
        mapper.addBlog(blog);

        blog.setId(IDUtiles.getId());
        blog.setTitle("微服务如此简单");
        mapper.addBlog(blog);


    }

    @Test
    public void test1() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper =  sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        map.put("title","java1");
        List<Blog> blogsIf = mapper.getBlogsIf(map);
        for (Blog blog : blogsIf) {
            System.out.println(blog);
        }
//        System.out.println(blogsIf);
    }


    @Test
    public void test2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map map = new HashMap();
//        map.put("title","Java如此简单");
//        map.put("views","999");
        map.put("author", "郭洋");
        List<Blog> blogChoose = mapper.getBlogChoose(map);
        for (Blog blog : blogChoose) {
            System.out.println(blog);
        }
    }

    @Test
    public void test3(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map map = new HashMap();
        map.put("title","java1");
        map.put("views","888");
        map.put("id","c104efb2c6854f0faa8df5a971386bad");
        int i = mapper.updateBlog(map);
    }


    @Test
    public void test4(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map map = new HashMap();
        List<Integer> ids = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            ids.add(i);
        }
        map.put("ids",ids);
        List<Blog> blogs = mapper.selectBlogForeach(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
    }
}

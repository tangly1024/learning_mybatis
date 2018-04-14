package com.troy1024.mapper;

import com.troy1024.bean.Article;
import com.troy1024.bean.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by tangly on 2018/4/14.
 */
public class UserMapperTest {

    private SqlSessionFactory sqlSessionFactory;
    private SqlSession openSession;
    UserMapper userMapper;

    @Before
    public void init() throws IOException {
        sqlSessionFactory = getSqlSessionFactory();
        openSession = sqlSessionFactory.openSession();
        userMapper = openSession.getMapper(UserMapper.class);

    }

    /**
     * 从配置中获取session
     *
     * @return
     * @throws IOException
     */
    public SqlSessionFactory getSqlSessionFactory() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        return new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void findUserById() throws Exception {

        User user = userMapper.findUserById(1);
        System.out.println(user);
    }

    @Test
    public void findUsersByUserNames() throws Exception {
        List<User> userList = userMapper.findUsersByUserNames("%1%");

        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void addUser() throws Exception {

        for (int i = 0; i <= 5; i++) {
            User user = new User("哈哈" + i, "备注" + i);
            userMapper.addUser(user);
            System.out.println(user);

        }
        openSession.commit();
    }

    @Test
    public void updateUser() throws Exception {
        User user = userMapper.findUserById(1);
        user.setNote("测试修改用户");
        userMapper.updateUser(user);
        openSession.commit();
    }

    @Test
    public void deleteUser() throws Exception {
        userMapper.deleteUser(1);
        openSession.commit();
    }

    @Test
    public void getUserArticles() throws Exception {
        List<Article> articles = userMapper.getUserArticles(1);
        for(Article a:articles){
            System.out.println(a);
        }
    }

}
package com.troy1024.mybatis;

import com.troy1024.bean.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @since 2017-07-15 
 * @author queen  
 * 编写测试Java类 
 * 
 */  
public class MyBatisTest {

    /**
     * 从配置中获取session
     * @return
     * @throws IOException
     */
    public SqlSessionFactory getSqlSessionFactory() throws IOException {
        String resource = "mybatis-config.xml";  
        InputStream inputStream = Resources.getResourceAsStream(resource);
        return new SqlSessionFactoryBuilder().build(inputStream);
    }

    /**
     * session的selectOne
     * @throws IOException
     */
    @Test
    public void testSession() throws IOException {
        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();  
        SqlSession openSession = sqlSessionFactory.openSession();
        try {
            User user = openSession.selectOne(
                    "com.troy1024.mapper.UserMapper.findUserById", "1");
            System.out.println(user);
        } finally {  
            openSession.close();  
        }  
    }


}
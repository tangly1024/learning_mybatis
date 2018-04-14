package com.troy1024.mybatis;

import com.troy1024.bean.Article;
import com.troy1024.bean.User;
import com.troy1024.mapper.UserMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by tangly on 2018/4/14.
 */
public class MyBatisSpringTest {

    private static ApplicationContext ctx;

    static
    {
        ctx = new ClassPathXmlApplicationContext("spring-mybatis.xml");
    }

    public static void main(String[] args)
    {
        UserMapper mapper = (UserMapper)ctx.getBean("userMapper");
        //测试id=1的用户查询，根据数据库中的情况，可以改成你自己的.
        System.out.println("得到用户id=1的用户信息");
        User user = mapper.findUserById(1);
        System.out.println(user);

        //得到文章列表测试
        System.out.println("得到用户id为1的所有文章列表");
        List<Article> articles = mapper.getUserArticlesByUserId(1);

        for(Article article:articles){
            System.out.println(article);
        }

    }
}

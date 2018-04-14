package com.troy1024;

import com.troy1024.bean.Article;
import com.troy1024.bean.User;
import com.troy1024.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by tangly on 2018/4/14.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MyBatisTestDynamicSql {
    @Autowired
    UserMapper userMapper;

    @Test
    public void getArticleListPyExample() throws Exception {
        Article exampleArticle = new Article();
        User user = new User();
        user.setId(1);
        exampleArticle.setUser(user);
        exampleArticle.setTitle("%4");
        exampleArticle.setContent("%5");

        List<Article> articles = userMapper.getArticleListPyExample(exampleArticle);
        for(Article a:articles){
            System.out.println(a);
        }
    }

    @Test
    public void updateArticleByNotNullParam(){
        Article article = new Article();
        article.setId(2);
        User user = new User();
        user.setId(2);
        article.setUser(user);
        userMapper.updateArticleByNotNulParam(article);
    }

}

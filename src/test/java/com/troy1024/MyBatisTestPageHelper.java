package com.troy1024;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.troy1024.bean.Article;
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
public class MyBatisTestPageHelper {
@Autowired
    UserMapper userMapper;

    @Test
    public void testPageHelper() {
        PageHelper.startPage(1, 10);
        List<Article> userList = userMapper.getUserArticlesByUserId(1);
        // 取商品列表
        for(Article user : userList) {
            System.out.println(user);
        }
        // 取分页信息
        PageInfo<Article> pageInfo = new PageInfo<>(userList);
        long total = pageInfo.getTotal(); //获取总记录数
        System.out.println("共有数据：" + total);
    }

}

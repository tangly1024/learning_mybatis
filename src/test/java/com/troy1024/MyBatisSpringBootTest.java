package com.troy1024;

import com.troy1024.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Created by tangly on 2018/4/14.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MyBatisSpringBootTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void test() {
        System.out.println(userMapper.findUserById(1));
    }

}

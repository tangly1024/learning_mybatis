package com.troy1024.mapper;

import com.troy1024.bean.User2Example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by tangly on 2018/4/14.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class User2MapperTest {

    @Autowired
    private User2Mapper user2Mapper;

    @Test
    public void countByExample() throws Exception {
        User2Example user2Example = new User2Example();
        user2Example.or().andIdEqualTo(1);
        System.out.println(user2Mapper.countByExample(user2Example));
    }

    @Test
    public void deleteByExample() throws Exception {

    }

    @Test
    public void deleteByPrimaryKey() throws Exception {

    }

    @Test
    public void insert() throws Exception {

    }

    @Test
    public void insertSelective() throws Exception {

    }

    @Test
    public void selectByExample() throws Exception {

    }

    @Test
    public void selectByPrimaryKey() throws Exception {

    }

    @Test
    public void updateByExampleSelective() throws Exception {

    }

    @Test
    public void updateByExample() throws Exception {

    }

    @Test
    public void updateByPrimaryKeySelective() throws Exception {

    }

    @Test
    public void updateByPrimaryKey() throws Exception {

    }

}
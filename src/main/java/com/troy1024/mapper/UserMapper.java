package com.troy1024.mapper;

import com.troy1024.bean.Article;
import com.troy1024.bean.User;

import java.util.List;

/**
 * @since 2017-07-15  
 * @author queen   
 * 定义一个UserMapper接口  
 *  
 */  
public interface UserMapper {  
    /**  
     * 根据ID查找用户  
     * @param id  
     * @return  
     */  
    User findUserById(int id);

    /**
     * 根据用户名查找用户
     * @param userName
     * @return
     */
    List<User> findUsersByUserNames(String userName);

    /**
     * 新增用户
     * @param user
     * @return
     */
    void addUser(User user);

    /**
     * 更新用户
     * @param user
     */
    void updateUser(User user);

    /**
     * 删除用户
     * @param id
     */
    void deleteUser(int id);

    /**
     * 获取用户发表的文章
     * @param i
     * @return
     */
    List<Article> getUserArticles(int i);


}
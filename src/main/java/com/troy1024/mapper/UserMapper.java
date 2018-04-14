package com.troy1024.mapper;

import com.troy1024.bean.User;

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
    public User findUserById(int id);
}
package com.troy1024.controller;

import com.troy1024.bean.Article;
import com.troy1024.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by tangly on 2018/4/14.
 */
@Controller
@RequestMapping("/article")
public class UserController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping("/list")
    @ResponseBody
    public Object listall(HttpServletRequest request, HttpServletResponse response) {
        List<Article> articles = userMapper.getUserArticlesByUserId(1);
        return articles;
    }
}

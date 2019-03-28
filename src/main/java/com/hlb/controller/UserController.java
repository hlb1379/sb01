package com.hlb.controller;

import com.hlb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

/**
 * Created by Fly on 2019/3/27.
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/hello") //跟RequestMapping一样，但是只接受get请求
    public String hello(){
        System.out.println("hello");
        return "hello";
    }

    @RequestMapping("/hi")
    public String getName() throws SQLException {
        userService.getAll();
        return "hi";
    }


}
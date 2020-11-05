package com.example.test.controller;

import com.example.test.entity.User;
import com.example.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping("/")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/getAllUser")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @PostMapping("/addUser")
    public int insertUser(@RequestBody User user){ //@RequestBody：这个注解很重要，因为前端是通过json格式用post方式传送过来的，这个注解可以帮助前端json和后端对象的交互
        return userService.insertUser(user);
    }
}

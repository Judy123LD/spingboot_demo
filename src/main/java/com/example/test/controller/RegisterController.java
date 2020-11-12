package com.example.test.controller;

import com.example.test.entity.User;
import com.example.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RegisterController {
    @Autowired
    UserService userService;

    @RequestMapping(value="/register",method= RequestMethod.POST)
    @ResponseBody
    public String register(@RequestBody User user){
        System.out.println("------------register params:"+user.getName()+user.getPassword());


        //从前端传过来的user对象
//        User new_user=new User();
//        new_user.setName(user.getName());
//        new_user.setPassword(user.getPassword());
        return(userService.register(user));

    }
}

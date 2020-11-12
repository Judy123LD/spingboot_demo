package com.example.test.controller;

import com.example.test.entity.User;
import com.example.test.service.UserService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

//    将Service注入Web层
    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public String show(){
        System.out.println();
        return "login";
    }


    @RequestMapping(value="/loginIn",method= RequestMethod.POST)
    @ResponseBody
//    public String login(String name,String password){
    public String login(@RequestBody User user){//没加RequestBody注解好像无法接收json数据类型
                                        //user对象默认是json格式的？
        System.out.println("8888888888:"+user.getName()+user.getPassword());
        User userEntity =userService.loginIn(user.getName(),user.getPassword());
        return "success";

//        if(userEntity !=null){
//            return "success";
//        }else{
//            return "error";
//        }
    }

//    @RequestMapping(value="/addUser",method= RequestMethod.POST)
//    public String addUser(String name,String password){
//        System.out.println("77777777:"+name+password);
//        User userEntity =userService.loginIn(name,password);
//
////        return "name+password";
//        if(userEntity !=null){
//            return "success";
//        }else{
//            return "error";
//        }
//    }
}

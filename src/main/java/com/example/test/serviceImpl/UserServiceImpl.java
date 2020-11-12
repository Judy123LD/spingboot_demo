package com.example.test.serviceImpl;

import com.example.test.entity.User;
import com.example.test.dao.UserDao;
import com.example.test.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    //将DAO注入Service层
    @Resource
    private UserDao userDao;

    @Override
    public User loginIn(String name, String password) {
        return userDao.findUserByNameAndPassword(name,password);
    }

    @Override
    public List<User> getAllUser() {
        return userDao.findAll();
    }

    @Override
    public String register(User user) {
        User userEntity=userDao.findUserByName(user.getName());
        if(userEntity!=null){//用户名已存在
           return "username existed";
        }else{//用户名未注册
            userDao.save(user);
            return "success";
        }
    }
}

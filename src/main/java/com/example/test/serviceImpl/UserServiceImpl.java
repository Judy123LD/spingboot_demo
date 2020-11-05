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
        return userDao.getInfo(name,password);
    }

    @Override
    public List<User> getAllUser() {
        return userDao.getAllUser();
    }

    @Override
    public int insertUser(@RequestBody User user) {
        return userDao.insertUser(user);
    }

}

package com.example.test.serviceImpl;

import com.example.test.entity.UserEntity;
import com.example.test.dao.UserDao;
import com.example.test.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    //将DAO注入Service层
    @Resource
    private UserDao userDao;

    @Override
    public UserEntity loginIn(String name, String password) {
        return userDao.getInfo(name,password);
    }
}

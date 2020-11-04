package com.example.test.dao;

import com.example.test.entity.UserEntity;

public interface UserDao {
    UserEntity getInfo(String name, String password);
}


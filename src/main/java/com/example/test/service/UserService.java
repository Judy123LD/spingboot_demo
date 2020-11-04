package com.example.test.service;

import com.example.test.entity.UserEntity;

public interface UserService {
    UserEntity loginIn(String name, String password);
}

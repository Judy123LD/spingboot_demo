package com.example.test.service;

import com.example.test.entity.User;

import java.util.List;

public interface UserService {
    User loginIn(String name, String password);

    List<User> getAllUser() ;

}

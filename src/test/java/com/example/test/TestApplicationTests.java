package com.example.test;

import com.example.test.entity.UserEntity;
import com.example.test.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestApplicationTests {

    @Autowired
    UserService userService;

    @Test
    void contextLoads() {
        UserEntity userEntity =userService.loginIn("huanhuan","1111");
        System.out.println("该用户ID为：");
        System.out.println(userEntity.getId());
    }

}

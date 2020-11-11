package com.example.test.dao;

import com.example.test.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDao extends JpaRepository<User,Integer>{
//    User getInfo(String name, String password);
//
//    @Select("select * from user")
//    public List<User> getAllUser();
    User findUserByNameAndPassword(String name,String password);

}


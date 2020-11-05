package com.example.test.dao;

import com.example.test.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {
    User getInfo(String name, String password);

    @Select("select * from user")
    public List<User> getAllUser();

    @Insert("insert into User(name,password) values (#{user.name},#{user.password})")
    public int insertUser(@Param("user") User user);
}


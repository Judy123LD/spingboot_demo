package com.example.test.dao;

import com.example.test.entity.Stu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
//方法名称必须要遵循驼峰式命名规则，findBy（关键字）+属性名称（首字母大写）+查询条件（首字母大写）

/**
 * 参数一 T :当前需要映射的实体
 * 参数二 ID :当前映射的实体中的ID的类型
 *
 */
public interface StuRepository extends JpaRepository<Stu,Integer> {
//方法名称必须要遵循驼峰式命名规则，findBy（关键字）+属性名称（首字母大写）+查询条件（首字母大写）
    List<Stu> findByName(String name);

    List<Stu> findByNameAndStuId(String name,String stuId);

    List<Stu> findByNameLike(String name);
    List<Stu> findByStuIdLike(String stuId);

//    @Query("update Users set name=? where id=?")
//    @Modifying
//        //需要执行一个更新操作
//    void updateStuNameById(String name,Integer id);
}

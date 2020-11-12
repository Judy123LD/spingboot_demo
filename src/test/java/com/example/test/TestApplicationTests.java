package com.example.test;

import com.example.test.dao.StuRepository;
import com.example.test.dao.UserDao;
import com.example.test.entity.Stu;
import com.example.test.entity.User;
import com.example.test.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TestApplicationTests {

    @Autowired
//    UserService userService;
    StuRepository  stuRepository;

    @Autowired
    UserDao userDao;

//    @Test
//    void contextLoads() {
//        User userEntity =userService.loginIn("huanhuan","1111");
//        System.out.println("该用户ID为：");
//        System.out.println(userEntity.getId());
//    }

    @Test
    public void testSave(){
        Stu stu=new Stu();
        stu.setName("huanhuan");
        stu.setStuId("2020140872");
        this.stuRepository.save(stu);
    }

    @Test
    public void findByName(){
        List<Stu> stus=this.stuRepository.findAll();
        for(Stu stu:stus){
            System.out.println("=======test======:"+stu.getStuId());
        }
    }

    @Test
    public void findByNameLike(){
        List<Stu> stus=this.stuRepository.findByNameLike("huan%");
        for(Stu stu:stus){
            System.out.println("=======test======:"+stu.getStuId());
        }
    }

    @Test
    public void findAll(){

//        User user=this.userDao.findUserByNameAndPassword("huanhuan","1111");

//            System.out.println("=======test======:"+user.getPassword()+user.getName());

    }

}

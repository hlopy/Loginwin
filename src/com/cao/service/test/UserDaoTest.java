package com.cao.service.test;

import com.cao.service.dao.UserDao;
import com.cao.service.dao.impl.UserDaoImpl;
import com.cao.service.pojo.user;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserDaoTest {
    UserDao userDao = new UserDaoImpl();
    @Test
    public void queryUserByUsername() {

        if(userDao.queryUserByUsername("admin") == null){
            System.out.println("用户可用");

        }else{
            System.out.println("用户已存在"+userDao.queryUserByUsername("admin"));
        }

    }

    @Test
    public void queryUserByUsernameAndPassword() {
        if(userDao.queryUserByUsernameAndPassword("admin","admin") == null) {

            System.out.println("登入失败！");
        }else{
            System.out.println("登入成功！");

        }
    }

    @Test
    public void saveUser() {
        System.out.println(userDao.saveUser(new user(null,"admin1","12345","1317370201@qq.com")));
    }
}
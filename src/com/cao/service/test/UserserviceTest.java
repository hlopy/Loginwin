package com.cao.service.test;

import com.cao.service.pojo.user;
import com.cao.service.service.Userservice;
import com.cao.service.service.impl.UserserviceImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserserviceTest {

    Userservice userservice = new UserserviceImpl();
    @Test
    public void registUser() {
        userservice.registUser(new user(null,"admin2","12345","3509192957@qq.com"));
    }

    @Test
    public void login() {
        System.out.println(userservice.login(new user(null,"admin","admin",null)));
    }

    @Test
    public void existsUsername() {
        if(userservice.existsUsername("")){
            System.out.println("用户已存在");
        }else{
            System.out.println("用户可用");
        }
    }
}
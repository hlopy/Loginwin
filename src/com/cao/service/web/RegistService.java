package com.cao.service.web;

import com.cao.service.pojo.user;
import com.cao.service.service.Userservice;
import com.cao.service.service.impl.UserserviceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegistService extends HttpServlet {

    private Userservice  userservice = new UserserviceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        1.获取请求的参数
        String username = req.getParameter("rename");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
//            2.验证参数
       // 3.检查用户名是否可用
        if(userservice.existsUsername(username)){
            System.out.println("用户名：["+username+"]已存在");
        }else{
            userservice.registUser(new user(null,username,password,email));
        }
//            4.


    }
}

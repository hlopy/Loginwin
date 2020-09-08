package com.cao.service.web;

import com.cao.service.pojo.user;
import com.cao.service.service.Userservice;
import com.cao.service.service.impl.UserserviceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginService extends HttpServlet {
    private  Userservice userservice =new UserserviceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      String username = req.getParameter("nametext");
      String password = req.getParameter("pwtext");
      user loginuser = userservice.login(new user(null,username,password,null));

      if(loginuser ==null){
          System.out.println("登入失败");
          req.getRequestDispatcher("").forward(req,resp);
      }else{
          System.out.println("登入成功");
          req.getRequestDispatcher("").forward(req,resp);
      }
    }
}

package com.cao.service.service.impl;
import com.cao.service.dao.UserDao;
import com.cao.service.dao.impl.UserDaoImpl;
import com.cao.service.pojo.user;
import com.cao.service.service.Userservice;

public class UserserviceImpl implements Userservice {
    UserDao userDao = new UserDaoImpl();
    @Override
    public void registUser(user user) {
        userDao.saveUser(user);
    }

    @Override
    public user login(user user) {
        return userDao.queryUserByUsernameAndPassword(user.getUsername(),user.getPasswd());

    }

    @Override
    public boolean existsUsername(String username) {

        if(userDao.queryUserByUsername(username) == null){
            //为空 表示数据库没查到name
            return true;
        }


        return false;
    }
}

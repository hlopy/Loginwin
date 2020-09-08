package com.cao.service.dao.impl;

import com.cao.service.dao.UserDao;
import com.cao.service.pojo.user;

public class UserDaoImpl extends BaseDao implements UserDao {
    @Override
    public user queryUserByUsername(String username) {
        String sql = "select id,username,passwd,email from t_user where username  = ? ";
        return queryForOne(user.class,sql,username);
    }

    @Override
    public user queryUserByUsernameAndPassword(String username, String password) {
        String sql = "select id,username,passwd,email from t_user where username = ? and passwd = ?";
        return queryForOne(user.class,sql,username,password);
    }

    @Override
    public int saveUser(user User) {
        String sql = "insert into t_user(username,passwd,email) values(?,?,?)";
        return update(sql,User.getUsername(),User.getPasswd(),User.getEmail());
    }
}

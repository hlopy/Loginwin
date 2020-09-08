package com.cao.service.dao;

import com.cao.service.pojo.user;


public interface UserDao {

    /***
     * 根据用户名 查询用户信息
     * @param username
     * @return 如果返回null 说明没有找到用户
     */
    public user queryUserByUsername(String username);

    /**
     * 根据用户名和密码查询用户信息
     * @param username
     * @param password
     * @return 如果返回null 说明用户名或密码错误
     */
    public user queryUserByUsernameAndPassword(String username, String passwd);


    /**
     * 保存用户信息
     * @param User
     * @return
     */
    public int saveUser(user User);


}

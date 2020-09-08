package com.cao.service.service;

import com.cao.service.pojo.user;

public interface Userservice {

    /**
     * 注册用户
     * @param user
     */
    public void registUser(user user);

    /**
     * 登录用户
     * @param user
     * @return
     */
    public user login(user user);

    /**
     * 检查用户名是否可用
     * @param username
     * @return 返回true 表示用户已存在 返回false 表户名可用
     */
    public boolean existsUsername(String username);


}

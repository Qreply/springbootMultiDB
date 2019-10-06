package com.wd.demo.db1.service;

import com.wd.demo.entity.User;

public interface IUserService {

    /**
     * 添加新用户
     * @param user
     */
    void saveUser(User user);
}

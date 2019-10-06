package com.wd.demo.db1.service.impl;

import com.wd.demo.db1.dao.IUserDao;
import com.wd.demo.db1.service.IUserService;
import com.wd.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public void saveUser(User user) {
        userDao.save(user);
    }
}

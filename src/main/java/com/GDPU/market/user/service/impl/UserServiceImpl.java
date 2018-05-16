package com.GDPU.market.user.service.impl;

import com.GDPU.market.user.dao.UserDao;
import com.GDPU.market.user.entity.User;
import com.GDPU.market.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User isUser(User user) {
        return userDao.isUser(user);
    }

    public Integer register(User user) {
        return userDao.register(user);
    }

    public Integer existUser(String username) {
        return userDao.existUser(username);
    }
}

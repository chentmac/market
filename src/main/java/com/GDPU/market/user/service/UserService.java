package com.GDPU.market.user.service;

import com.GDPU.market.user.entity.User;

public interface UserService {

    User isUser(User user);

    Integer register(User user);

    Integer existUser(String username);
}

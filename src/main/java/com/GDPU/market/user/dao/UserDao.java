package com.GDPU.market.user.dao;

import com.GDPU.market.user.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {

    User isUser(@Param(value = "user") User user);

    Integer register(@Param(value = "user") User user);

    Integer existUser(String username);
}

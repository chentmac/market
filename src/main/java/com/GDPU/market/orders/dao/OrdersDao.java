package com.GDPU.market.orders.dao;

import com.GDPU.market.user.entity.User;

import java.util.Date;

public interface OrdersDao {
    Integer newOrders(String oid, Date date, User user);
}

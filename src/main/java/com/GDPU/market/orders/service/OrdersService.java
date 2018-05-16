package com.GDPU.market.orders.service;

import com.GDPU.market.orders.entity.Orders;
import com.GDPU.market.user.entity.User;

import java.util.Date;

public interface OrdersService {
    Integer newOrders(String oid, Date date, User user);
}

package com.GDPU.market.orders.service.impl;

import com.GDPU.market.orders.dao.OrdersDao;
import com.GDPU.market.orders.service.OrdersService;
import com.GDPU.market.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service("OrderService")
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrdersDao ordersDao;

    public Integer newOrders(String oid, Date date, User user) {
        return ordersDao.newOrders(oid, date, user);
    }
}

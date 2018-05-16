package com.GDPU.market.orders.controller;

import com.GDPU.market.car.entity.Car;
import com.GDPU.market.car.entity.CarItems;
import com.GDPU.market.car.service.CarService;
import com.GDPU.market.orders.entity.Orders;
import com.GDPU.market.orders.entity.OrdersItems;
import com.GDPU.market.orders.service.OrdersService;
import com.GDPU.market.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.UUID;

@Controller
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    @Autowired
    private CarService carService;

    @RequestMapping("/getOrders")
    public String getOrders() {
        return null;
    }

    @RequestMapping("/newOrders")
    public String newOrders(HttpServletRequest request, HttpSession session) {
//        if (session.getAttribute("user") == null) {
//            return "front/login";
//        }
//        User user = (User) session.getAttribute("user");
//        Car car = carService.getCar(user);
//        car.setCarItemsList(carService.getCarItems(car.getCarid()));
//        System.out.println(car.toString());
        Car car = (Car) request.getSession().getAttribute("car");
        request.getSession().setAttribute("car", car);
        return "front/order";
    }

}

package com.GDPU.market.car.controller;

import com.GDPU.market.car.entity.Car;
import com.GDPU.market.car.entity.CarItems;
import com.GDPU.market.car.service.CarService;
import com.GDPU.market.goods.entity.Goods;
import com.GDPU.market.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarService carService;

    @RequestMapping("/getCar")
    public String car(HttpServletRequest request, HttpSession session) {
        Float total = 0f;
        if (session.getAttribute("user") == null) {
            return "front/login";
        }
        User user = (User) session.getAttribute("user");
        Car car = carService.getCar(user);
        car.setCarItemsList(carService.getCarItems(car.getCarid()));
        for (CarItems carItems : car.getCarItemsList()) {
            total += carItems.getSubTotal();
        }
        if (carService.updateCar(car.getCarid(), total) != null) {
            car = carService.getCar(user);
            car.setCarItemsList(carService.getCarItems(car.getCarid()));
        }
        System.out.println(car.toString());
        request.getSession().setAttribute("car", car);
        return "front/car";
    }

    @RequestMapping("/addToCar")
    public String addToCar(HttpServletRequest request, HttpSession session, Goods goods, Integer counts, Float subTotal, String bljj) {
        Float total = 0f;
        if (session.getAttribute("user") == null) {
            return "front/login";
        }
        User user = (User) session.getAttribute("user");
        Car car = carService.getCar(user);
        if (carService.addToCar(goods, car, counts, subTotal) == null) {
            System.out.println("添加购物车失败！");
        }
        car.setCarItemsList(carService.getCarItems(car.getCarid()));
        for (CarItems carItems : car.getCarItemsList()) {
            total += carItems.getSubTotal();
        }
        if (carService.updateCar(car.getCarid(), total) != null) {
            car = carService.getCar(user);
            car.setCarItemsList(carService.getCarItems(car.getCarid()));
        }
        request.getSession().setAttribute("car", car);
        return "front/car";
    }

    @RequestMapping("/deleteByCiid")
    public String deleteByCiid(HttpServletRequest request, HttpSession session, Integer ciid) {
        Float total = 0f;
        User user = (User) session.getAttribute("user");
        Car car = carService.getCar(user);
        carService.deleteByCiid(ciid);
        car.setCarItemsList(carService.getCarItems(car.getCarid()));
        for (CarItems carItems : car.getCarItemsList()) {
            total += carItems.getSubTotal();
        }
        if (carService.updateCar(car.getCarid(), total) != null) {
            car = carService.getCar(user);
            car.setCarItemsList(carService.getCarItems(car.getCarid()));
        }
        request.getSession().setAttribute("car", car);
        return "front/car";
    }

    @RequestMapping("/deleteAll")
    public String deleteAll(HttpServletRequest request, HttpSession session) {
        Float total = 0f;
        User user = (User) session.getAttribute("user");
        Car car = carService.getCar(user);
        carService.deleteAll(car.getCarid());
        car.setCarItemsList(carService.getCarItems(car.getCarid()));
        for (CarItems carItems : car.getCarItemsList()) {
            total += carItems.getSubTotal();
        }
        if (carService.updateCar(car.getCarid(), total) != null) {
            car = carService.getCar(user);
            car.setCarItemsList(carService.getCarItems(car.getCarid()));
        }
        request.getSession().setAttribute("car", car);
        return "front/car";
    }
}

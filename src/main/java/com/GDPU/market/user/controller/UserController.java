package com.GDPU.market.user.controller;

import com.GDPU.market.car.service.CarService;
import com.GDPU.market.goods.service.GoodsService;
import com.GDPU.market.user.entity.User;
import com.GDPU.market.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private GoodsService goodsService;
    @Autowired
    private CarService carService;

    @RequestMapping("/doLogin")
    public String userLogin(HttpServletRequest request, HttpSession session, User user) {
        if (userService.isUser(user) != null) {
            user = userService.isUser(user);
            session.setAttribute("user", user);
            if (carService.getCar(user) == null) {
                if (carService.newCar(user) != null) {
                    System.out.println("生成新购物车！");
                }
            }
            return "front/main";
        }
        request.getSession().setAttribute("msg", "用户名不存在或密码错误！");
        return "front/login";
    }

    @RequestMapping("/quit")
    public String userQuit(HttpServletRequest request, HttpSession session) {
        System.out.println(session.getAttribute("user").toString());
        if (session.getAttribute("user") != null) {
            System.out.println(session.getAttribute("user"));
            session.setMaxInactiveInterval(1);
        }
        request.getSession().removeAttribute("msg");
        return "front/login";
    }

    @RequestMapping("/doRegister")
    public String userRegister(User user) {
        if (userService.existUser(user.getUsername()) != null) {
            System.out.println("注册失败！");
            return "front/register";
        }
        if (userService.register(user) != null) {
            System.out.println("注册成功！");
            return "front/login";
        }
        return "front/register";
    }

    @RequestMapping(value = "/userExist", method = RequestMethod.GET)
    public void userExist(HttpServletResponse response, String username) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        if (userService.existUser(username) != null) {
            response.getWriter().println("<font color='red'>用户名已存在！</font>");
        } else {
            response.getWriter().println("<font color='green'>用户名可用！</font>");
        }
    }

}

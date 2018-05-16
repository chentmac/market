package com.GDPU.market.index.controller;

import com.GDPU.market.category.service.CategoryService;
import com.GDPU.market.goods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/main")
    public String toMain(HttpServletRequest request) {
        request.getSession().setAttribute("goodsList", goodsService.queryAll());
        request.getSession().setAttribute("categoryList", categoryService.queryAll());
        return "front/main";
    }

    @RequestMapping("/userLoginPage")
    public String userLogin() {
        return "front/login";
    }

    @RequestMapping("/userRegisterPage")
    public String userRegister() {
        return "front/register";
    }

    @RequestMapping("/adminLoginPage")
    public String adminLogin() {
        return "back/login";
    }

}

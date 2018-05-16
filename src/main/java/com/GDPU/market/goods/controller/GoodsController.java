package com.GDPU.market.goods.controller;

import com.GDPU.market.goods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/showDesc")
    public String showDesc(HttpServletRequest request, Integer gid){
        request.getSession().setAttribute("goods", goodsService.queryById(gid));
        return "front/desc";
    }

    @RequestMapping("/search")
    public String search(HttpServletRequest request, String search){
        request.getSession().setAttribute("searchList", goodsService.queryByName(search));
        return "front/searchList";
    }
}

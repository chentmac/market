package com.GDPU.market.category.controller;

import com.GDPU.market.category.service.CategoryService;
import com.GDPU.market.category.service.impl.CategoryServiceImpl;
import com.GDPU.market.goods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/queryByCategory")
    public String queryByCategory(HttpServletRequest request, Integer cid){
        request.getSession().setAttribute("goodsForCategoryList", goodsService.queryByCategory(cid));
        return "front/categoryList";
    }

}

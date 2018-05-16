package com.GDPU.market.admin.controller;

import com.GDPU.market.admin.entity.Admin;
import com.GDPU.market.admin.service.AdminService;
import com.GDPU.market.category.entity.Category;
import com.GDPU.market.category.service.CategoryService;
import com.GDPU.market.goods.entity.Goods;
import com.GDPU.market.goods.service.GoodsService;
import com.GDPU.market.utils.ImageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @Autowired
    private GoodsService goodsService;

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/main")
    public String toMain(){
        return "back/main";
    }

    @RequestMapping("/addGoodsPage")
    public String addGoods() {
        return "back/addGoods";
    }

    @RequestMapping("/categoryPage")
    public String adminCategory() {
        return "back/category";
    }

    @RequestMapping("/doLogin")
    public String doLogin(HttpServletRequest request, HttpSession session, Admin admin) {
        if (adminService.isAdmin(admin) != null) {
            session.setAttribute("admin", adminService.isAdmin(admin));
            return "back/main";
        }
        request.getSession().setAttribute("msg", "账号不存在或密码错误！");
        return "back/login";
    }

    @RequestMapping("/addGoods")
    public String addGoods(HttpServletRequest request, Goods goods, Category category, MultipartFile file) throws IOException {
        ImageUtil imageUtil = new ImageUtil();
        goods.setImage(imageUtil.ImageUpload(file, request));
        if (file == null) {
            System.out.println("请上传图片");
        }
        System.out.println("Cid:" + category.getCid());
        goods.setCategory(category);
        Integer count = goodsService.addGoods(goods);
        if (count == null) {
            System.out.println("上传失败");
        }
        System.out.println("上传成功");
        request.getSession().removeAttribute("goodsList");
        request.getSession().setAttribute("goodsList", goodsService.queryAll());
        return "back/main";
    }

    @RequestMapping("/showDesc")
    public String showDesc(HttpServletRequest request, Integer gid) {
        request.getSession().setAttribute("goods", goodsService.queryById(gid));
        return "back/desc";
    }

    @RequestMapping("/deleteById")
    public String deleteById(HttpServletRequest request, Integer gid) {
        if (goodsService.deleteById(gid) == null) {
            System.out.println("删除失败！");
        }
        request.getSession().removeAttribute("goodsList");
        request.getSession().setAttribute("goodsList", goodsService.queryAll());
        return "back/main";
    }

    @RequestMapping("/addCategory")
    public String addCategory(HttpServletRequest request, Category category) {
        categoryService.addCategory(category);
        request.getSession().removeAttribute("categoryList");
        request.getSession().setAttribute("categoryList", categoryService.queryAll());
        return "back/category";
    }

    @RequestMapping("/quit")
    public String adminQuit(HttpServletRequest request, HttpSession session) {
        System.out.println(session.getAttribute("admin").toString());
        if (session.getAttribute("admin") != null) {
            System.out.println(session.getAttribute("admin"));
            session.setMaxInactiveInterval(1);
        }
        request.getSession().removeAttribute("msg");
        return "front/login";
    }

}

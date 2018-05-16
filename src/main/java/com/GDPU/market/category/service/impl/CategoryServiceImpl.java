package com.GDPU.market.category.service.impl;

import com.GDPU.market.category.dao.CategoryDao;
import com.GDPU.market.category.entity.Category;
import com.GDPU.market.category.service.CategoryService;
import com.GDPU.market.goods.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("CategoryService")
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;


    public List<Category> queryAll() {
        return categoryDao.queryAll();
    }

    public Integer addCategory(Category category) {
        return categoryDao.addCategory(category);
    }

}

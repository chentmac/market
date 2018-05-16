package com.GDPU.market.category.service;

import com.GDPU.market.category.entity.Category;
import com.GDPU.market.goods.entity.Goods;

import java.util.List;

public interface CategoryService {

    List<Category> queryAll();

    Integer addCategory(Category category);

}

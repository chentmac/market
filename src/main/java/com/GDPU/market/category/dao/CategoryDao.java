package com.GDPU.market.category.dao;

import com.GDPU.market.category.entity.Category;
import com.GDPU.market.goods.entity.Goods;

import java.util.List;

public interface CategoryDao {

    List<Category> queryAll();

    Integer addCategory(Category category);

}

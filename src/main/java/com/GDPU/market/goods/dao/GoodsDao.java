package com.GDPU.market.goods.dao;

import com.GDPU.market.goods.entity.Goods;

import java.util.List;

public interface GoodsDao {

    List<Goods> queryAll();

    Goods queryById(Integer gid);

    Integer addGoods(Goods goods);

    Integer deleteById(Integer gid);

    List<Goods> queryByName(String search);

    List<Goods> queryByCategory(Integer cid);
}

package com.GDPU.market.goods.service;

import com.GDPU.market.goods.entity.Goods;
import java.util.List;

public interface GoodsService {

    List<Goods> queryAll();

    Integer addGoods(Goods goods);

    Integer deleteById(Integer gid);

    Goods queryById(Integer gid);

    List<Goods> queryByName(String search);

    List<Goods> queryByCategory(Integer cid);
}

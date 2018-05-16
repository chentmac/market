package com.GDPU.market.goods.service.impl;

import com.GDPU.market.goods.dao.GoodsDao;
import com.GDPU.market.goods.entity.Goods;
import com.GDPU.market.goods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("GoodsService")
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsDao goodsDao;

    public List<Goods> queryAll() {
        return goodsDao.queryAll();
    }

    public Integer addGoods(Goods goods) {
        return goodsDao.addGoods(goods);
    }

    public Integer deleteById(Integer gid) {
        return goodsDao.deleteById(gid);
    }

    public Goods queryById(Integer gid) {
        return goodsDao.queryById(gid);
    }

    public List<Goods> queryByName(String search) {
        return goodsDao.queryByName(search);
    }

    public List<Goods> queryByCategory(Integer cid) {
        return goodsDao.queryByCategory(cid);
    }
}

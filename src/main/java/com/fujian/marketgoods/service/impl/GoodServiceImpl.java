package com.fujian.marketgoods.service.impl;


import com.fujian.marketgoods.dao.GoodsDao;
import com.fujian.marketgoods.pojo.entity.Goods;
import com.fujian.marketgoods.service.GoodService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodServiceImpl implements GoodService {

    @Resource
    GoodsDao goodsDao;

    @Override
    public Goods getGoodsByGoodsId(Integer goodsId) {
        return goodsDao.selectByPrimaryKey(goodsId);
    }

    @Override
    public List<Goods> getGoodsByGoodsTypeId(int parseInt) {
        return goodsDao.getGoodsByGoodsTypeId(parseInt);
    }

    @Override
    public List<Goods> selectAll() {
        return goodsDao.selectAll();
    }

    @Override
    public int addGoods(Goods goods) {

        return goodsDao.insert(goods);
    }
}

package com.fujian.marketgoods.service;

import com.fujian.marketgoods.pojo.entity.Goods;

import java.util.List;

public interface GoodService {
    public List<Goods> selectAll();

    int addGoods(Goods goods);

    List<Goods> getGoodsByGoodsTypeId(int parseInt);

    Goods getGoodsByGoodsId(Integer goodsId);
}

package com.fujian.marketgoods.service;

import com.fujian.marketgoods.pojo.entity.GoodsType;

import java.util.List;

public interface GoodsTypeService {

    List<GoodsType> goodsTypeList();

    int  insertGoodsType(GoodsType goodsType);

    List<GoodsType> goodsTypeByParentID(Integer data1);
}

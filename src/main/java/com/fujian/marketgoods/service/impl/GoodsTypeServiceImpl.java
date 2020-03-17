package com.fujian.marketgoods.service.impl;

import com.fujian.marketgoods.dao.GoodsTypeDao;
import com.fujian.marketgoods.pojo.entity.GoodsType;
import com.fujian.marketgoods.service.GoodsTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsTypeServiceImpl implements GoodsTypeService {

    @Resource
    GoodsTypeDao goodsTypeDao;

    @Override
    public List<GoodsType> goodsTypeList() {
        return goodsTypeDao.selectAll();
    }

    @Override
    public int insertGoodsType(GoodsType goodsType) {

        return goodsTypeDao.insert(goodsType);
    }

    @Override
    public List<GoodsType> goodsTypeByParentID(Integer data1) {
        return goodsTypeDao.goodsTypeByParentID(data1);
    }
}

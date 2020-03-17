package com.fujian.marketgoods.dao;

import com.fujian.marketgoods.pojo.entity.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsDao {
    int deleteByPrimaryKey(Integer goodsId);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Integer goodsId);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);

    public List<Goods> selectAll();

    List<Goods> getGoodsByGoodsTypeId(int parseInt);
}
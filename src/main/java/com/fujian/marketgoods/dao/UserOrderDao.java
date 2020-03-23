package com.fujian.marketgoods.dao;

import com.fujian.marketgoods.pojo.entity.UserOrder;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserOrderDao {
    int deleteByPrimaryKey(Integer orderId);

    int insert(UserOrder record);

    int insertSelective(UserOrder record);

    UserOrder selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(UserOrder record);

    int updateByPrimaryKey(UserOrder record);
}
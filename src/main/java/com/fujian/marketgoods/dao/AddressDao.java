package com.fujian.marketgoods.dao;

import com.fujian.marketgoods.pojo.entity.Address;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AddressDao {
    int insert(Address record);

    int insertSelective(Address record);

    List<Address> getAddressByUserId(Integer userId);
}
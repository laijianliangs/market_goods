package com.fujian.marketgoods.service.impl;

import com.fujian.marketgoods.dao.AddressDao;
import com.fujian.marketgoods.pojo.entity.Address;
import com.fujian.marketgoods.service.AddressService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class AddressServiceImpl implements AddressService {


    @Resource
    AddressDao addressDao;
    @Override
    public List<Address> getAddressByUserId(Integer userId) {
        return addressDao.getAddressByUserId(userId);
    }
}

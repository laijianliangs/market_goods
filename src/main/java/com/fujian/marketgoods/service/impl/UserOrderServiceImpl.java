package com.fujian.marketgoods.service.impl;

import com.fujian.marketgoods.dao.UserOrderDao;
import com.fujian.marketgoods.pojo.entity.UserOrder;
import com.fujian.marketgoods.service.UserOrderService;
import com.fujian.marketgoods.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserOrderServiceImpl implements UserOrderService {

    @Resource
    UserOrderDao userOrderDao;

    @Override
    public int insertUserOrder(UserOrder userOrder) {
        return userOrderDao.insert(userOrder);
    }
}

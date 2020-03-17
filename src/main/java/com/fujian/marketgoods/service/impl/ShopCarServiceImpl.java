package com.fujian.marketgoods.service.impl;

import com.fujian.marketgoods.dao.ShopCarDao;
import com.fujian.marketgoods.pojo.entity.ShopCar;
import com.fujian.marketgoods.service.ShopCarService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class ShopCarServiceImpl implements ShopCarService {


    @Resource
    ShopCarDao shopCarDao;
    @Override
    public int addShopCar(ShopCar shopCar1) {
        return shopCarDao.insert(shopCar1);
    }

    @Override
    public List<ShopCar> getShopCarByUserId(int user_id) {
        return shopCarDao.getShopCarByUserId(user_id);
    }
}

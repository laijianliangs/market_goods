package com.fujian.marketgoods.service;

import com.fujian.marketgoods.pojo.entity.ShopCar;

import java.util.List;

public interface ShopCarService {
    int addShopCar(ShopCar shopCar1);

    List<ShopCar> getShopCarByUserId(int user_id);
}

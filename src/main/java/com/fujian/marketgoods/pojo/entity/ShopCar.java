package com.fujian.marketgoods.pojo.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * shop_car
 * @author 
 */

@Component
public class ShopCar implements Serializable {
    /**
     * 购物车id
     */
    private Integer shopCarId;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 商品id
     */
    private Integer goodsId;

    /**
     * 商品数量
     */
    private Integer count;

    private static final long serialVersionUID = 1L;

    public Integer getShopCarId() {
        return shopCarId;
    }

    public void setShopCarId(Integer shopCarId) {
        this.shopCarId = shopCarId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
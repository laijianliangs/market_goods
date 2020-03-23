package com.fujian.marketgoods.pojo.vo;

import com.fujian.marketgoods.pojo.entity.Goods;
import com.fujian.marketgoods.pojo.entity.ShopCar;

import java.io.Serializable;

/**
 * 有关购物车的Vo(查询出来的ShopCar的元素)
 */
public class ShopCarVo2 extends ShopCar implements Serializable {

   private Goods goods;

   private Double totalMoney;

    @Override
    public String toString() {
        return "ShopCarVo2{" +
                "goods=" + goods +
                ", totalMoney='" + totalMoney + '\'' +
                '}';
    }

    public Double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }
}

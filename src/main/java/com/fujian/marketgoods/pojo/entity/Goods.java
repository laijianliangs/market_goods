package com.fujian.marketgoods.pojo.entity;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * goods
 * @author 
 */
@Component
public class Goods implements Serializable {
    /**
     * 商品主键
     */
    @JSONField(ordinal = 1)
    private Integer goodsId;

    /**
     * 商品标题
     */
    @JSONField(ordinal = 2)
    private String title;

    /**
     * 图片地址
     */
    @JSONField(ordinal = 3)
    private String img;

    /**
     * 商品类型id
     */
    @JSONField(ordinal = 4)
    private Integer goodsTypeId;

    /**
     * 商品原价
     */
    @JSONField(ordinal = 5)
    private Double oldPrice;

    /**
     * 商品现价
     */
    @JSONField(ordinal = 6)
    private Double price;

    /**
     * 是否在售：YES OR NO
     */
    @JSONField(ordinal = 7)
    private String onSale;

    /**
     * 商品详情
     */
    @JSONField(ordinal = 8)
    private String detail;

    /**
     * 商品数量
     */
    @JSONField(ordinal = 9)
    private Integer count;

    /**
     * 商家的名字
     */
    private String merchantName;

    /**
     * 评价数
     */
    private Integer commentCount;

    private static final long serialVersionUID = 1L;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Integer getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(Integer goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }

    public Double getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(Double oldPrice) {
        this.oldPrice = oldPrice;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getOnSale() {
        return onSale;
    }

    public void setOnSale(String onSale) {
        this.onSale = onSale;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsId=" + goodsId +
                ", title='" + title + '\'' +
                ", img='" + img + '\'' +
                ", goodsTypeId=" + goodsTypeId +
                ", oldPrice=" + oldPrice +
                ", price=" + price +
                ", onSale='" + onSale + '\'' +
                ", detail='" + detail + '\'' +
                ", count=" + count +
                ", merchantName='" + merchantName + '\'' +
                ", commentCount=" + commentCount +
                '}';
    }
}
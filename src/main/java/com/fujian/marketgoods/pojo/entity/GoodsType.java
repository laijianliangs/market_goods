package com.fujian.marketgoods.pojo.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * goods_type
 * @author 
 */

@Component
public class GoodsType implements Serializable {
    /**
     * 商品类型id
     */
    private Integer goodsTypeId;

    /**
     * 商品父类类型id
     */
    private Integer parentTypeId;

    /**
     * 商品类型名称
     */
    private String typeName;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 图标样式
     */
    private String iconClass;

    private static final long serialVersionUID = 1L;

    public Integer getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(Integer goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }

    public Integer getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(Integer parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getIconClass() {
        return iconClass;
    }

    public void setIconClass(String iconClass) {
        this.iconClass = iconClass;
    }

    @Override
    public String toString() {
        return "GoodsType{" +
                "goodsTypeId=" + goodsTypeId +
                ", parentTypeId=" + parentTypeId +
                ", typeName='" + typeName + '\'' +
                ", sort=" + sort +
                ", iconClass='" + iconClass + '\'' +
                '}';
    }
}
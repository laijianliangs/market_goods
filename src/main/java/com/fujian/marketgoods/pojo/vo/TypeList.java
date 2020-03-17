package com.fujian.marketgoods.pojo.vo;

import com.fujian.marketgoods.pojo.entity.GoodsType;

import java.util.List;

public class TypeList {

    private String name;

    private List<GoodsType> list;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<GoodsType> getList() {
        return list;
    }

    public void setList(List<GoodsType> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "TypeList{" +
                "name='" + name + '\'' +
                ", list=" + list +
                '}';
    }
}

package com.fujian.marketgoods.pojo.dto;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


@Component
public class GoodsListDto implements Serializable {

    @JSONField(ordinal = 1)
    private int code =0;

    @JSONField(ordinal = 2)
    private String msg ="";

    @JSONField(ordinal = 3)
    private int count;

    @JSONField(ordinal = 4)
    private  List<Object> data = new ArrayList<>() ;


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Object> getData() {
        return data;
    }

    public void addObject(Object object)
    {
        data.add(object);
    }


    @Override
    public String toString() {
        return "GoodsListDto{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", count=" + count +
                ", data=" + data +
                '}';
    }
}

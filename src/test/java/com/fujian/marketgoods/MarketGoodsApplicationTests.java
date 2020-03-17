package com.fujian.marketgoods;

import com.alibaba.fastjson.JSON;
import com.fujian.marketgoods.dao.GoodsDao;
import com.fujian.marketgoods.pojo.dto.GoodsListDto;
import com.fujian.marketgoods.pojo.entity.Goods;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class MarketGoodsApplicationTests {

    @Resource
    GoodsDao goodsDao;

    @Test
    void contextLoads() {

    }

    @Test
    void TESTS()
    {
        GoodsListDto goodsListDto = new GoodsListDto();
       List<Goods> list = new ArrayList<>();
        goodsListDto.setCode(1);
        goodsListDto.setMsg("");
        goodsListDto.setCount(2);

        goodsListDto.addObject("dasdsa");
        goodsListDto.addObject("dassa");

        String s = JSON.toJSONString(goodsListDto);
        System.out.println(s);
        list =  goodsDao.selectAll();
        System.out.println(list.toString());

    }

}

package com.fujian.marketgoods.controller;


import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fujian.marketgoods.pojo.entity.Goods;
import com.fujian.marketgoods.pojo.entity.GoodsType;
import com.fujian.marketgoods.pojo.vo.TypeList;
import com.fujian.marketgoods.service.GoodService;
import com.fujian.marketgoods.service.GoodsTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class indexController {

    @Resource
    GoodsTypeService goodsTypeService;

    @Resource
    GoodService goodService;


    /**
     * 实现主页的基本功能
     *
     * @param model
     * @return
     */
    @RequestMapping("/")
    public String hello(Model model) {

        /**
         * 实现主页左边的商品类型列表
         * @param model
         * @return
         */
        List<GoodsType> gt = goodsTypeService.goodsTypeList();
        List<TypeList> list = new ArrayList<>();
        for (GoodsType s : gt) {
            TypeList typeList = new TypeList();
            List list2 = new ArrayList<GoodsType>();
            if (s.getParentTypeId() == -1) {
                for (GoodsType s2 : gt) {
                    if ((int) s2.getParentTypeId() == (int) s.getGoodsTypeId()) {
                        list2.add(s2);
                    }
                }
                typeList.setName(s.getTypeName());
                typeList.setList(list2);
                list.add(typeList);
            }

        }
        model.addAttribute("types_list", list);
        System.out.println(list);

        /**
         * 实现主页右边的商品详细列表
         * @param model
         * @return
         */
        List<Goods> goods = goodService.selectAll();
        model.addAttribute("goods_list", goods);
        return "index";
    }


    @RequestMapping("/pages/index/goods/{pid}")
    @ResponseBody
    public String goodsList(@PathVariable Integer pid) {
        List<Goods> list = goodService.getGoodsByGoodsTypeId(pid);
//        System.out.println(list);
        return JSON.toJSONString(list);
    }


    @RequestMapping("/pages/index/goodsDetail/{goodsId}")
    public String goodsDetail(@PathVariable Integer goodsId,Model model) {

       Goods goods= goodService.getGoodsByGoodsId(goodsId);
//        System.out.println(goods);
       model.addAttribute("goods_detail",goods);
        return "/pages/front/goodsDetail";
    }
}
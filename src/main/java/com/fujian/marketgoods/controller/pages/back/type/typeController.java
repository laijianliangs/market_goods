package com.fujian.marketgoods.controller.pages.back.type;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fujian.marketgoods.pojo.entity.GoodsType;
import com.fujian.marketgoods.service.GoodService;
import com.fujian.marketgoods.service.GoodsTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/pages/back/type")
public class typeController {

    @Resource
    GoodsTypeService goodsTypeService;

    @RequestMapping("add")
    String addType(Model model)
    {
         List<GoodsType> list = goodsTypeService.goodsTypeList();
         model.addAttribute("goods_type_2_list",list);
        return "pages/back/type/addType";
    }

    @RequestMapping(value = "addType",produces = "application/json;charset=UTF-8")
    @ResponseBody
    String add(@RequestBody String  data)
    {
        GoodsType goodsType=JSONArray.parseObject(data, GoodsType.class);
        System.out.println(goodsType);
        if(goodsType != null)
        {
            goodsTypeService.insertGoodsType(goodsType);
            return "success";
        }else {

            return "添加失败！";

        }


    }

    @RequestMapping("test")
    String addType1()
    {
        return "pages/back/type/test";
    }


}

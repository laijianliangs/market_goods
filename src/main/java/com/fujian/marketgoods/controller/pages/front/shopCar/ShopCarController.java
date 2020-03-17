package com.fujian.marketgoods.controller.pages.front.shopCar;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fujian.marketgoods.pojo.entity.Goods;
import com.fujian.marketgoods.pojo.entity.ShopCar;
import com.fujian.marketgoods.pojo.entity.User;
import com.fujian.marketgoods.pojo.vo.ShopCarVo;
import com.fujian.marketgoods.pojo.vo.ShopCarVo2;
import com.fujian.marketgoods.service.GoodService;
import com.fujian.marketgoods.service.ShopCarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.jws.WebParam;
import javax.servlet.http.HttpSession;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/pages/front/shopCar")
public class ShopCarController {

    @Resource
    ShopCarService shopCarService;


    @Resource
    ShopCar shopCar1;

    @Resource
    GoodService goodService;



    /**
     * 跳转到我的购物车页面
     * @return
     */
    @RequestMapping("")
    String ShopCar(Model model,HttpSession  session)
    {
//        System.out.println(session.getAttribute("user"));
       List <ShopCar> list = shopCarService.getShopCarByUserId(((User)session.getAttribute("user")).getUserId());
       List <Goods> list2 = goodService.selectAll();
       List<ShopCarVo2> list1 = new ArrayList<>();

       for(ShopCar s :list)
       {
           ShopCarVo2 shopCarVo2 =new ShopCarVo2();
           for(Goods g :list2)
           {
               Goods goods = new Goods();
               if((int)s.getGoodsId()==(int)g.getGoodsId())
               {
                   goods.setTitle(g.getTitle());
                   goods.setPrice(g.getPrice());
                   goods.setImg(g.getImg());
                   shopCarVo2.setCount(s.getCount());
                   shopCarVo2.setGoodsId(s.getGoodsId());
                   shopCarVo2.setGoods(goods);
                   shopCarVo2.setShopCarId(s.getShopCarId());
                   double d =g.getPrice()*s.getCount();
                   shopCarVo2.setTotalMoney(d);

               }

           }
           list1.add(shopCarVo2);
       }
       model.addAttribute("shopCarVo_list",list1);
       session.setAttribute("shopCarVo_list",list1);
       return "/pages/front/shopCar/shopCar";
    }


    /**
     * 添加购物车
     * @param shopCar
     * @param session
     * @return
     */
    @RequestMapping("/add")
    @ResponseBody
    String addShopCar(@RequestBody List<ShopCarVo> shopCar, HttpSession session)
    {
        shopCar1.setGoodsId(shopCar.get(0).getGoodsId());
        shopCar1.setCount(shopCar.get(0).getCount());
        shopCar1.setUserId(((User)session.getAttribute("user")).getUserId());
        shopCarService.addShopCar(shopCar1);
        return "OK";
    }
}

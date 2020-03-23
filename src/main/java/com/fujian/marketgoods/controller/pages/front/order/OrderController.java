package com.fujian.marketgoods.controller.pages.front.order;


import com.alibaba.fastjson.JSONObject;
import com.fujian.marketgoods.pojo.entity.Address;
import com.fujian.marketgoods.pojo.entity.User;
import com.fujian.marketgoods.pojo.entity.UserOrder;
import com.fujian.marketgoods.pojo.vo.ShopCarVo;
import com.fujian.marketgoods.pojo.vo.ShopCarVo2;
import com.fujian.marketgoods.service.AddressService;
import com.fujian.marketgoods.service.UserOrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/pages/front/order")
public class OrderController {

  @Resource
  AddressService addressService;

  @Resource
  UserOrderService userOrderService;


    @RequestMapping("/addpre")
    String addpre(String selectedListItem,String totalMoney,HttpSession session,Model model)
    {
        List<ShopCarVo2> shopCarList = JSONObject.parseArray(selectedListItem, ShopCarVo2.class);
        System.out.println(shopCarList);
        User user= (User) session.getAttribute("user");
        List<Address>   addressList= (List<Address>) addressService.getAddressByUserId(user.getUserId());
        System.out.println(addressList);
        model.addAttribute("user",user);
        model.addAttribute("addressList",addressList);
        model.addAttribute("shopCarList",shopCarList);
        model.addAttribute("totalMoney",totalMoney);
        return "/pages/front/order/order_detail";
    }


    @RequestMapping("/add")
    String add(UserOrder userOrder,HttpSession session)
    {
        System.out.println(userOrder);
        User user = (User) session.getAttribute("user");
        userOrder.setPayTime(new Date());
        userOrder.setCreateTime(new Date());
        userOrder.setStatus("待支付");
        userOrder.setUserId(user.getUserId());
        userOrderService.insertUserOrder(userOrder);
        return null;
    }
}

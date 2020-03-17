package com.fujian.marketgoods.controller.pages.front.order;


import com.fujian.marketgoods.pojo.entity.User;
import com.fujian.marketgoods.pojo.vo.ShopCarVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/pages/front/order")
public class OrderController {


    @RequestMapping("/addpre")
    String addrpre(HttpSession session,Model model)
    {
        model.addAttribute("shopCarVo_list",session.getAttribute("shopCarVo_list"));
        return "/pages/front/order/order_detail";
    }
}

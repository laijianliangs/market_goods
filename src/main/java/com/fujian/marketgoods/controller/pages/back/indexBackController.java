package com.fujian.marketgoods.controller.pages.back;


import com.alibaba.fastjson.JSON;
import com.fujian.marketgoods.pojo.dto.GoodsListDto;
import com.fujian.marketgoods.pojo.entity.Goods;
import com.fujian.marketgoods.pojo.entity.GoodsType;
import com.fujian.marketgoods.pojo.entity.User;
import com.fujian.marketgoods.service.GoodService;
import com.fujian.marketgoods.service.GoodsTypeService;
import com.fujian.marketgoods.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import java.util.ArrayList;
import java.util.List;

/**
 * 有关后台管理的操作
 */

@Controller
@RequestMapping("/pages/back")
public class indexBackController {


    @Resource
    UserService userService;

    @Resource
    GoodService goodService;

    @Resource
    GoodsTypeService goodsTypeService;



    /**
     * 验证手机号码与密码
     */
    @RequestMapping("index_back")
    String index(User user, Model model, HttpSession httpSession)
    {

        if("".equals(user.getPhone())||user.getPhone()==null)
        {
            model.addAttribute("errorMsg","请输入手机号码！");
            return "pages/front/loginPage";
        }else {
            if(userService.login(user))
            {
              httpSession.setAttribute ("user",userService.getUseIdByPhone(user.getPhone()));
                return "pages/back/indexBack";
            }else{
                model.addAttribute("error2Msg","手机号码或密码错误！");
                return "pages/front/loginPage";
            }

        }


    }

    /**
     * 把后台的商品的转成json数据格式，发送到前端进行渲染，
     * 呈现出表格的形式（利用Layui动态Table技术）
     * @return
     */

    @RequestMapping("goods_list")
    @ResponseBody
    String goodsList()
    {
        List<Goods> list = new ArrayList<>();
        list = goodService.selectAll();
        GoodsListDto goodsListDto =new GoodsListDto();
        goodsListDto.setCount(list.size());
        for(Goods d : list)
        {
            goodsListDto.addObject(d);
        }
        String s = JSON.toJSONString(goodsListDto);
        return s;

    }

    /**
     * 发布商品
     * @return
     */

    @RequestMapping("release_goods")
    String releaseGoods(Model model)
    {

       model.addAttribute("goods_type_1_list",goodsTypeService.goodsTypeList());
        String str = JSON.toJSONString(goodsTypeService.goodsTypeList());
        model.addAttribute("goods",str);

        return "pages/back/releaseGoods";

    }

    @RequestMapping("all_goods")
    String allGoods()
    {

        return "pages/back/allGoods";

    }

    @RequestMapping("child_goodsType")
    @ResponseBody
    String childGoodsType(@RequestBody String data1,Model model)
    {

        System.out.println(data1.replace("=",""));
        List<GoodsType> list=goodsTypeService.goodsTypeByParentID(Integer.parseInt(data1.replace("=","")));
        return JSON.toJSONString(list);

    }



}

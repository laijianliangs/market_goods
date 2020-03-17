package com.fujian.marketgoods.controller.pages.front;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pages/front")
public class LoginController {


    @RequestMapping("loginPage")
    String login()
    {

        return "pages/front/loginPage";
    }


}

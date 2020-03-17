package com.fujian.marketgoods.controller.pages.back;


import com.fujian.marketgoods.pojo.entity.Goods;
import com.fujian.marketgoods.service.GoodService;
import com.fujian.marketgoods.service.GoodsTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
@RequestMapping("/pages/back/goods")
public class GoodsController {

    @Resource
    GoodService goodService;

    @Resource
    GoodsTypeService goodsTypeService;

    @RequestMapping("addGoods")
    String addGoods(Goods goods, Model model)
    {

        if(goods.getOnSale()==null)
        {
            goods.setOnSale("no");
        }
        if(goods.getOnSale().equals("on"))
        {
            System.out.println(goods.getOnSale());
            goods.setOnSale("yes");
        }

        goodService.addGoods(goods);
        model.addAttribute("goods_type_1_list",goodsTypeService.goodsTypeList());

        return "pages/back/releaseGoods";
    }


    @ResponseBody
    @RequestMapping("uploadImg")
    public Map upload(MultipartFile file, HttpServletRequest request){

        String prefix="";
        String dateStr="";
        //保存上传
        OutputStream out = null;
        InputStream fileInput=null;
        try{
            if(file!=null){
                String originalName = file.getOriginalFilename();
                prefix=originalName.substring(originalName.lastIndexOf(".")+1);
                Date date = new Date();
                String uuid = UUID.randomUUID()+"";
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                dateStr = simpleDateFormat.format(date);
                String filepath = "C:\\Users\\ASUS\\IdeaProjects\\market-goods\\src\\main\\view\\static\\images\\goods_imgs\\" + dateStr+uuid+"." + prefix;


                File files=new File(filepath);
                //打印查看上传路径
                System.out.println(filepath);
                if(!files.getParentFile().exists()){
                    files.getParentFile().mkdirs();
                }
                file.transferTo(files);
                Map<String,Object> map2=new HashMap<>();
                Map<String,Object> map=new HashMap<>();
                map.put("code",0);
                map.put("msg","");
                map.put("data",map2);
                map2.put("src","/view/static/images/goods_imgs/"+ dateStr+uuid+"." + prefix);
                return map;
            }

        }catch (Exception e){
        }finally{
            try {
                if(out!=null){
                    out.close();
                }
                if(fileInput!=null){
                    fileInput.close();
                }
            } catch (IOException e) {
            }
        }
        Map<String,Object> map=new HashMap<>();
        map.put("code",1);
        map.put("msg","");
        return map;

    }

}

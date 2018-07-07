/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: ItemsController1
 * Author:   chencay
 * Date:     2018/6/29 22:10
 * Description: 实现注解版本的handler，对商品的查询
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.test.springmvc.controller;

import com.test.springmvc.pojo.Items;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ItemsController2 {

    //@RequestMapping实现对queryItems和url进行映射，一个方法对应一个url
    @RequestMapping("/queryItems")
    public ModelAndView queryItems() throws Exception{

        List<Items> itemsList = new ArrayList<Items>();

        Items items_1 = new Items();
        items_1.setName("联想笔记本");
        items_1.setPrice(6000f);
        items_1.setDetail("ThinkPad 联想笔记本电脑");

        Items items_2 = new Items();
        items_2.setName("苹果笔记本");
        items_2.setPrice(9000f);
        items_2.setDetail("Mac 苹果笔记本电脑");

        itemsList.add(items_1);
        itemsList.add(items_2);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("itemsList",itemsList);

        //下边的路径，如果在视图解析器中配置（springmvc中配置）jsp路径的前缀和后缀,下面只需要写个名字即可
        modelAndView.setViewName("itemsList");
        return modelAndView;
    }

    //可以定义其他的方法


}

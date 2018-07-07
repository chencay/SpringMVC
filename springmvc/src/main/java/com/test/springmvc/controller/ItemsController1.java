/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: ItemsController1
 * Author:   chencay
 * Date:     2018/6/29 22:10
 * Description: 实现controller接口的处理器，对商品的查询
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.test.springmvc.controller;

import com.test.springmvc.pojo.Items;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

public class ItemsController1  implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        //调用service（业务逻辑）查找数据库，查询商品列表，这里使用静态数据模拟（后面与mybatis结合再使用动态数据）
        List<Items> itemsList;
        itemsList = new ArrayList<Items>();

        //向itemsList填充静态数据
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

        //返回ModelAndView
        ModelAndView modelAndView = new ModelAndView();
        //相当于request的setAttribute,jsp页面通过itemsList得到数据（attributeName可以随意取名）
        modelAndView.addObject("itemsList",itemsList);

        //指定视图
        modelAndView.setViewName("/WEB-INF/statics/jsp/itemsList.jsp");
        return modelAndView;
    }
}

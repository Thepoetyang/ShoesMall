package com.itdr.controller;

import com.itdr.common.ServerResponse;
import com.itdr.config.ConstCode;
import com.itdr.pojo.User;
import com.itdr.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * ClassName: OrderController
 * 日期: 2020/2/29 11:07
 *
 * @author Air张
 * @since JDK 1.8
 */

@Controller
@ResponseBody
@RequestMapping("/portal/order/")
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping("create.do")
    public ServerResponse create(HttpSession session,Integer shippingId){
        User user = (User) session.getAttribute("user");
        if (user == null) {
            return ServerResponse.defeatedRS(ConstCode.DEFAULT_FAIL, ConstCode.UserEnum.NO_LOGIN.getDesc());
        }

        return orderService.create(user,shippingId);
    }


}

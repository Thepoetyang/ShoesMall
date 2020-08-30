package com.itdr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName: IndexController
 * 日期: 2020/2/25 9:33
 *
 * @author Air张
 * @since JDK 1.8
 */

@Controller
@RequestMapping("/portal/index/")
@ResponseBody
public class IndexController {

    @RequestMapping("c.do/{b}")
    public String show(@PathVariable(value = "b") int a){
        return "ok";
    }
}

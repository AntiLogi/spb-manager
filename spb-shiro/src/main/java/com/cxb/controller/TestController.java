package com.cxb.controller;

import com.cxb.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author chenxiaobin
 * @description
 * @create 2017/11/28
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
   private TestService testService;
    @RequestMapping("index")
    @ResponseBody
    public String index(){
        System.out.println("???");
        return testService.test();
    }
}

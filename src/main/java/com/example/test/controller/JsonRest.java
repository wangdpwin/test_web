package com.example.test.controller;

import com.example.test.annotation.DateFormate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wangdongpeng
 * @Date: 2018/12/13 上午11:14
 * @Description
 * @Version 1.0
 */
@RestController
public class JsonRest {

    @RequestMapping("/log")
    public String getLog(@DateFormate String dateStr){
        return "<h1>Hello World</h1>";
    }
}
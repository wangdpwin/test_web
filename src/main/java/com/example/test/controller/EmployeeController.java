package com.example.test.controller;

import com.example.test.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: wangdongpeng
 * @Date: 2019/2/19 下午12:11
 * @Description
 * @Version 1.0
 */
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/add")
    public void addEmployee() {
        for (int i = 0; i < 1000; i++) {
            new Thread(() -> employeeService.addEmployee()).start();
        }
    }

}

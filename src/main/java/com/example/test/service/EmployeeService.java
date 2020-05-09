package com.example.test.service;

import com.example.test.dao.EmployeeRepository;
import com.example.test.model.Employee;
import com.nova.frame.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: wangdongpeng
 * @Date: 2019/2/19 下午12:12
 * @Description
 * @Version 1.0
 */
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    @Transactional
    public synchronized void addEmployee() {

        // 查出ID为8的记录，然后每次将年龄增加一
        Employee employee = employeeRepository.getOne(8);
        System.out.println(employee);
        Integer age = employee.getAge();
        employee.setAge(age + 1);

        employeeRepository.save(employee);
    }

}

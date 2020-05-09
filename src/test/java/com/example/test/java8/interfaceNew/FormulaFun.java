package com.example.test.java8.interfaceNew;

/**
 * @Author: wangdongpeng
 * @Date: 2018/12/11 下午2:43
 * @Description
 * @Version 1.0
 */
public class FormulaFun implements Formula {
    @Override
    public String hello(String word) {
        return this.say(" from say");
    }
}

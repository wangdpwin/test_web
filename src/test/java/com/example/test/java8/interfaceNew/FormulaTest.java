package com.example.test.java8.interfaceNew;

import org.junit.Test;

/**
 * @Author: wangdongpeng
 * @Date: 2018/12/11 下午2:44
 * @Description
 * @Version 1.0
 */
public class FormulaTest {

    @Test
    public void test(){
        Formula formula = new FormulaFun();
        System.out.println(formula.hello("你好"));
        System.out.println(formula.say("你好啊"));
    }

}

package com.example.test.java8.interfaceNew;

/**
 * @Author: wangdongpeng
 * @Date: 2018/12/11 下午2:41
 * @Description
 * @Version 1.0
 */
public interface Formula {

    String hello(String word);

    default String say(String word){
        return "hello"+word;
    }
}

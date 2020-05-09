package com.example.test.java8.functional;

/**
 * @Author: wangdongpeng
 * @Date: 2018/12/11 下午6:27
 * @Description
 * @Version 1.0
 */
interface PersonFactory<P extends Person> {
    P create(String firstName, String lastName);
}

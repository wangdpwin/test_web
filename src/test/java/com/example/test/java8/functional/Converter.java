package com.example.test.java8.functional;

/**
 * @Author: wangdongpeng
 * @Date: 2018/12/11 下午2:54
 * @Description
 * @Version 1.0
 */
//函数式接口 lambda表达式
@FunctionalInterface
interface Converter<F, T> {
    //只能包含一个抽象方法
    T convert(F from);
    //第二个抽象方法，编译报错
//  T get(F from);
}

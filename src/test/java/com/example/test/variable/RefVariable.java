package com.example.test.variable;

import com.alibaba.fastjson.JSON;
import java.util.Date;
import org.junit.Test;

/**
 * 测试引用传递作用域
 * 栈中变量 => 堆中对象
 * 方法A到方法B中，改变的是对象的值，引用不发生变化，return时改变引用地址
 *
 */
public class RefVariable {

    /**
     * 引用类型的值传递是地址的副本，操作副本地址会影响原数据
     */
    @Test
    public void testRef(){
        Date date = new Date();
        System.out.println("start: "+JSON.toJSONString(date.toLocaleString()));
        changeRef(date);
        System.out.println("end: "+JSON.toJSONString(date.toLocaleString()));
    }

    private void changeRef(Date date) {
        date.setDate(1);
        date.setHours(1);
        System.out.println("changed: "+JSON.toJSONString(date.toLocaleString()));
//        return date;
    }

    /**
     * A方法向方法B传递一个引用类型的地址值a，在方法内更换变量的引用地址为b，但是不返回b，不会影响原方法的变量a的应用
     * 当return时a变量的引用发生变化
     */
    @Test
    public void testRefNew(){
        Date date = new Date();
        System.out.println("start: "+JSON.toJSONString(date.toLocaleString()));
        changeRefNew(date);
        System.out.println("end: "+JSON.toJSONString(date.toLocaleString()));
    }

    private void changeRefNew(Date date) {
        Date now = new Date();
        now.setDate(1);
        now.setHours(1);
        date = now;
        System.out.println("changed: "+JSON.toJSONString(date.toLocaleString()));
//        return date;
    }

    /**
     * 包装类型拆箱为基本类型
     */
    @Test
    public void testRef2(){
        Integer val = new Integer(1);
        System.out.println("start: "+val.intValue());
        changeRef2(val);
        System.out.println("end: "+val.intValue());
    }

    private void changeRef2(Integer val) {
        val = new Integer(2);
        System.out.println("changed: "+val);
    }

    /**
     * 引用类型的值传递是地址的副本，操作副本地址会影响原数据
     */
    @Test
    public void testBase(){
        int val =1;
        System.out.println("start: "+val);
        changeBase(val);
        System.out.println("end: "+val);
    }

    private void changeBase(int val) {
        val++;
        System.out.println("changed: "+val);
    }
}

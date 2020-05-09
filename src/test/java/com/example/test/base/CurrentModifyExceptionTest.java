package com.example.test.base;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.junit.Test;

/**
 * @Author: wangdongpeng
 * @Date: 2018/12/17 下午12:04
 * @Description 测试 ConcurrentModificationException
 * @Version 1.0
 */
public class CurrentModifyExceptionTest {

    List<String> list = Arrays.asList("aaa","bbbb","cccc","ddd","eee");

    @Test
    public void foreach(){

    }

    @Test
    public void iterable(){
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String str = iterator.next();
            if(str.equals("aaa")){
                list.remove(str);
                list.add("***");
            }
        }
        System.out.println(list.toString());
    }

    @Test
    public void stream(){
        list.stream().forEach(s -> s.concat("  ***  "));
        System.out.println(list.toString());
    }

}

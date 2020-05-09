package com.example.test.guava.collection;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.google.common.reflect.TypeToken;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import org.junit.Test;

/**
 * @Author: wangdongpeng
 * @Date: 2019/1/29 上午11:24
 * @Description
 * @Version 1.0
 */
public class TypeTokenTest {

    @Test
    public void checck(){
        ArrayList<String> stringList = Lists.newArrayList();
        ArrayList<Integer> intList = Lists.newArrayList();
        System.out.println("intList type is " + intList.getClass());
        System.out.println("stringList type is " + stringList.getClass());
        System.out.println(stringList.getClass().isAssignableFrom(intList.getClass()));
    }

    @Test
    public void checkTokenType(){
        //空的内部类
        TypeToken<ArrayList<String>> typeToken = new TypeToken<ArrayList<String>>() {

        };
        // resolveType
        TypeToken<?> genericTypeToken = typeToken.resolveType(ArrayList.class.getTypeParameters()[0]);
        System.out.println(typeToken.getType());
        System.out.println(genericTypeToken.getType());
    }

    @Test
    public void test(){
        TypeVariable<Class<ArrayList>>[] variables = ArrayList.class.getTypeParameters();
        System.out.println(JSON.toJSONString(variables[0]));
    }

}

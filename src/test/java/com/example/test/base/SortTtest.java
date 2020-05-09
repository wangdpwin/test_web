package com.example.test.base;

import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: wangdongpeng
 * @Date: 2018/12/17 上午11:55
 * @Description
 * @Version 1.0
 */
public class SortTtest {

    public static void main(String[] args){
        List<String> list  =   new ArrayList<String>();
        list.add("ccc");
        list.add("aaa");
        list.add("111");
        list.add("bbb");
        list.add("aaa");
        list.add("0");
        list.add("aba");
        list.add("aaa");

//        Set set = new HashSet();
//        List newList = new  ArrayList();
//        for (String cd:list) {
//            if(set.add(cd)){
//                newList.add(cd);
//            }
//        }
        ImmutableList<String> strings = ImmutableSet.copyOf(Iterables.filter(list, Predicates.not(Predicates.isNull()))).asList();
        System.out.println( "去重后的集合： " + strings);
    }

}

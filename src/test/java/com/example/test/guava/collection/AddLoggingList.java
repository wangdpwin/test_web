package com.example.test.guava.collection;

import com.google.common.collect.ForwardingList;
import com.nova.frame.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @Author: wangdongpeng
 * @Date: 2019/1/7 下午4:45
 * @Description
 * @Version 1.0
 */
public class AddLoggingList<E> extends ForwardingList<E> {

    List<E> delegate = new ArrayList<>(); // backing list

    @Override protected List<E> delegate() {
        return delegate;
    }
    @Override public void add(int index, E elem) {
        System.out.println(index + ":" + elem);
        super.add(index, elem);
    }
    @Override public boolean add(E elem) {
        return standardAdd(elem); // 用add(int, E)实现
    }
    @Override public boolean addAll(Collection<? extends E> c) {
        return standardAddAll(c); // 用add实现
    }

    public static void main(String[] args) {
        List<String> list = new AddLoggingList();
        list.add("a");
        list.add("b");
        list.add("c");
    }

}


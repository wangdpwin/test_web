package com.example.test.gc;

/**
 * @Author: wangdongpeng
 * @Date: 2019/1/3 下午8:07
 * @Description
 * @Version 1.0
 */
public class HeapGCTest {

    public static void main(String[] args) {
        byte[] b1 = new byte[1024 * 102 / 2];
        byte[] b2 = new byte[1024 * 102 / 8];
        b2 = null;
        b2 = new byte[1024 * 102 / 8];
//        System.gc();
    }

}

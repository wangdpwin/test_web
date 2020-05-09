package com.example.test.enumTest;

/**
 * @Author: wangdongpeng
 * @Date: 2018/12/11 下午2:19
 * @Description
 * @Version 1.0
 */
public class Resource {

    private volatile static Resource instance;

    public static void getSingleton() {
        if (instance == null) {                         //Single Checked
            synchronized (Resource.class) {
                if (instance == null) {                 //Double Checked
                    instance = new Resource();
                }
            }
        }
        System.out.println(instance.toString());
    }
}

package com.example.test.enumTest;

/**
 * @Author: wangdongpeng
 * @Date: 2018/12/11 下午2:19
 * @Description
 * @Version 1.0
 */
public enum SomeThing {
    INSTANCE;
    private Resource instance;
    SomeThing() {
        instance = new Resource();
    }
    public Resource getInstance() {
        return instance;
    }

}

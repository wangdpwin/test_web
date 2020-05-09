package com.example.test.datasource;

import java.util.Random;

/**
 * 测试连接池获取，返回连接
 */
public class DataSourceTest {

    public static void main(String[] args) {
        Thread[] threads = new Thread[10];
        for(int i=0;i<10;i++){
            Random r = new Random();
            int time = r.nextInt(10);
            threads[i] = new Thread(new MyThread(time));
        }
        for(Thread t:threads){
            t.start();
        }
    }

}

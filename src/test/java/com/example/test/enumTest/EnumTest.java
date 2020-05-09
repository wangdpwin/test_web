package com.example.test.enumTest;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import org.junit.Test;

/**
 * @Author: wangdongpeng
 * @Date: 2018/12/11 下午2:20
 * @Description 单例模式有五种写法：懒汉、饿汉、双重检验锁、静态内部类、枚举
 * @Version 1.0
 */
public class EnumTest {

    private static final Executor executor =  Executors.newFixedThreadPool(5);

    public static void main(String[] args) {
        //Enum
        Runnable task = () -> { testSigleTon(); };
        Runnable task2 = () -> { testSigleTon(); };
        Runnable task3 = () -> { testSigleTon(); };
        Runnable task4 = () -> { testSigleTon(); };
        Runnable task5 = () -> { testSigleTon(); };
//        executor.execute(task);
//        executor.execute(task2);
//        executor.execute(task3);
//        executor.execute(task4);
//        executor.execute(task5);
        System.out.println("===================");
        //double check
        Runnable r = () -> { getInstance(); };
        Runnable r2 = () -> { getInstance(); };
        Runnable r3 = () -> { getInstance(); };
        Runnable r4 = () -> { getInstance(); };
        Runnable r5 = () -> { getInstance(); };
        executor.execute(r);
        executor.execute(r2);
        executor.execute(r3);
        executor.execute(r4);
        executor.execute(r5);

    }

    public static void testSigleTon(){
        Resource instance = SomeThing.INSTANCE.getInstance();
        System.out.println(instance.toString());
    }

    public static void getInstance(){
        Resource.getSingleton();
    }
}

package com.example.test.datasource;

import java.util.Stack;

public class MyDataSource {

    private static volatile Object lock = new Object();

    private static final Stack<MyConnect> stack = new Stack<MyConnect>();

    //初始化5个连接
    static {
        for(int i=1;i<6;i++){
            stack.push(new MyConnect(i));
        }


    }

    public static MyConnect getConnect() {
        if(stack.size()>0){
            return stack.pop();
        }else {
            System.out.println("conncet is empty , wait");
            try {
                synchronized (lock){
                    lock.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return stack.pop();
        }
    }

    public static void setConnect(MyConnect connect){
        if(stack.size()<5){
            stack.push(connect);
            synchronized (lock){
                lock.notifyAll();
            }

        }else {
            System.out.println("conncet is enough , wait");
        }

    }

}

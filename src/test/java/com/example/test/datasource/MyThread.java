package com.example.test.datasource;

public class MyThread implements Runnable {

    private int time;

    public MyThread (int time){
        this.time = time;
    }

    @Override
    public void run() {
        MyConnect connect = MyDataSource.getConnect();
        System.out.println(Thread.currentThread().getName() + " run and get connect:"+connect.getNumber() + " sleep "+ time +" second");
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        MyDataSource.setConnect(connect);
        System.out.println("connect "+connect.getNumber() + " return");
        System.out.println(Thread.currentThread().getName() + " end");
    }

}

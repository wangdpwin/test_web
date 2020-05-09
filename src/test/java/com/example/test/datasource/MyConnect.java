package com.example.test.datasource;

public class MyConnect {

    private int number;

    public MyConnect(int number) {
        this.number = number;
        System.out.println("create connect number: " + number);
    }

    public int getNumber() {
        return number;
    }
}

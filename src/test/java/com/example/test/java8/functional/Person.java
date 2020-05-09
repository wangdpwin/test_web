package com.example.test.java8.functional;

/**
 * @Author: wangdongpeng
 * @Date: 2018/12/11 下午6:27
 * @Description
 * @Version 1.0
 */
public class Person {
    String firstName;
    String lastName;

    Person() {}

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person say(String f,String t){
        return new Person(f,t);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

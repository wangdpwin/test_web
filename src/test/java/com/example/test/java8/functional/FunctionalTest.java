package com.example.test.java8.functional;

import org.junit.Test;

/**
 * @Author: wangdongpeng
 * @Date: 2018/12/11 下午2:54
 * @Description
 * @Version 1.0
 */
public class FunctionalTest {

    @Test
    public void test(){
        /**
         * interface type = override method body
         * 重写方法：
         *   入参 -> 方法体 ，直接输出或返回值
         */
        Converter<String,Integer> converter = from -> Integer.valueOf(from);
        Integer convertValue = converter.convert("123");
        System.out.println(convertValue);


        Something something = new Something();
        Converter<String, String> converter2 = something::startsWith;
        String converted = converter2.convert("Java");
        System.out.println(converted);    // "J"

        PersonFactory<Person> personFactory = Person::new;
        Person person = personFactory.create("Peter", "Parker");
        System.out.println(person);

        Person person2 = new Person();
        PersonFactory<Person> personFactory2 = person2::say;
        Person person3 = personFactory.create("Peter", "Parker");
        System.out.println(person);
    }

    @Test
    public void testSquare(){
        final int num = 1;
        Converter<Integer, String> stringConverter = (from) -> String.valueOf(from + num);
        String s = stringConverter.convert(2);// 3
        System.out.println(s);

        int num2 = 1;
        Converter<Integer, String> stringConverter2 = (from) -> String.valueOf(from + num2);

    }

}


class Something {
    String startsWith(String s) {
        return String.valueOf(s.charAt(0));
    }

    String subString(String start,String end) {
        return start.substring(0,1);
    }
}

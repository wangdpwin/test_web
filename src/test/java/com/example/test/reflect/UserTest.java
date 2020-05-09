package com.example.test.reflect;

import com.alibaba.fastjson.JSON;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

/**
 * @Author: wangdongpeng
 * @Date: 2018/12/13 下午5:28
 * @Description
 * @Version 1.0
 */
public class UserTest {

    @Test
    public void test() throws IllegalAccessException {
        List<User> users = new ArrayList<User>();
        Field[] fields = User.class.getDeclaredFields();
        Object[] arr = {"name","desc",1};
        for(int i=0;i<10;i++){
            User user = new User();
            int j=0;
            for(Field f:fields){
                f.setAccessible(true);
                f.set(user,arr[j]);
                j++;
            }
            users.add(user);
        }
        System.out.println(JSON.toJSONString(users));
    }

}

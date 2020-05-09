package com.example.test.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Author: wangdongpeng
 * @Date: 2018/12/13 上午11:11
 * @Description
 * @Version 1.0
 */
@Component
@Aspect
public class DateFormatAspect {

    @Pointcut("@annotation(com.example.test.annotation.DateFormate)")
    private void cut() {
        System.out.println("point cut");
    }

    /**
     * 定制一个环绕通知
     * @param joinPoint
     */
    @Around("cut()")
    public void advice(ProceedingJoinPoint joinPoint){
        System.out.println("环绕通知之开始");
        try {
            joinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("环绕通知之结束");
    }

    @Before("cut()")
    public void before() {
        System.out.println("已经记录下操作日志@Before 方法执行前");
    }

    @After("cut()")
    public void after() {
        System.out.println("已经记录下操作日志@After 方法执行后");
    }

}

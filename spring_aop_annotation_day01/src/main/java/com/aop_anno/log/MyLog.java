package com.aop_anno.log;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyLog {
    @Pointcut(value = "execution(* com.aop_anno.service..*(..))")
    public void pt(){}

    @Before(value = "pt()")
    public void beforeLog(){
        System.out.println("前置通知。。。");
    }

    @AfterReturning(value = "pt()")
    public void afterReturn(){
        System.out.println("后置通知。。。");

    }

    @AfterThrowing(value = "pt()")
    public void afterThrow(){
        System.out.println("异常通知。。。");

    }

    @After(value = "pt()")
    public void after(){
        System.out.println("最终通知。。。");
    }
}

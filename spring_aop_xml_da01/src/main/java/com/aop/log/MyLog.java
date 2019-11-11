package com.aop.log;

public class MyLog {
    public void beforeLog(){
        System.out.println("前置通知。。。");
    }
    public void afterReturn(){
        System.out.println("后置通知。。。");
    }
    public void afterThrow(){
        System.out.println("异常通知。。。");
    }
    public void after(){
        System.out.println("最终通知。。。");
    }
}

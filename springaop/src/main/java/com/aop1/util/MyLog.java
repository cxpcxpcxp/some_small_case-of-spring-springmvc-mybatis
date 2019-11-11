package com.aop1.util;

public class MyLog {
    public void MyLogBefore(){
        System.out.println("输出日志。。。前置");
    }
    public void MyLogAfterReturn(){
        System.out.println("输出日志。。。后置");
    }
    public void MyLogAfterThrow(){
        System.out.println("输出日志。。。异常");
    }
    public void MyLogAfter(){
        System.out.println("输出日志。。。最终");


    }
}

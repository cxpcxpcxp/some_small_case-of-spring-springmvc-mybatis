package com.aopproxy.producer;

public class MyProducer implements IProducer{
    @Override
    public String sellComputer(double money) {
        System.out.println("生产厂商出售了"+money+"元的电脑");
        return "出售成功";
    }
}

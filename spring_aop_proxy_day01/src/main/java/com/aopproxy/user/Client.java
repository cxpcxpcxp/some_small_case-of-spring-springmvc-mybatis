package com.aopproxy.user;

import com.aopproxy.producer.IProducer;
import com.aopproxy.producer.MyProducer;
import com.aopproxy.proxy.MyProxy;

public class Client {
    public static void main(String[] args) {
        MyProducer myProducer = new MyProducer();
        IProducer iProducer = MyProxy.sell(myProducer);
        String s = iProducer.sellComputer(100);
        System.out.println(s);

    }
}

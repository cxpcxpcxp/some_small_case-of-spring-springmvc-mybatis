package com.aopproxy.proxy;

import com.aopproxy.producer.IProducer;
import com.aopproxy.producer.MyProducer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyProxy {
    public static IProducer sell(final MyProducer myProducer){
        IProducer o = (IProducer) Proxy.newProxyInstance(myProducer.getClass().getClassLoader(),
                myProducer.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if(method.getName().equals("sellComputer")){
                            System.out.println("扣除两百");
                        }
                        Object o1 = method.invoke(myProducer, args);
                        return o1;
                    }
                });
        return o;
    }
}

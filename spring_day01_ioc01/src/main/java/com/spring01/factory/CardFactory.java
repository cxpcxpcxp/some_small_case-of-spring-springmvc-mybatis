package com.spring01.factory;

import com.spring01.service.ICardService;
import com.spring01.service.impl.CardServiceImpl;

public class CardFactory {
    public ICardService openSession(){
        return new CardServiceImpl();
    }
    public void initMethod(){
        System.out.println("创建之前。。。。。");
    }
}

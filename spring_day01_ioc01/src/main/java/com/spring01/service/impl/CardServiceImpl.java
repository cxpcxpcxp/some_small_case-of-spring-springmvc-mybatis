package com.spring01.service.impl;

import com.spring01.service.ICardService;

public class CardServiceImpl implements ICardService {
    @Override
    public void findAll() {
        System.out.println("查询所有card===》实例方法构造对象");
    }
}

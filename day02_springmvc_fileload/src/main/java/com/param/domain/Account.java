package com.param.domain;

import java.io.Serializable;

public class Account implements Serializable {
    private String aname;
    private double money;

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "aname='" + aname + '\'' +
                ", money=" + money +
                '}';
    }
}

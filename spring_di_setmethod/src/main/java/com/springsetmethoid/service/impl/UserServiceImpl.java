package com.springsetmethoid.service.impl;

import com.springsetmethoid.service.IUserService;

import java.util.Date;

public class UserServiceImpl implements IUserService {
    private int id;
    private String user_name;
    private String user_pwd;
    private Date date;
    /*//    构造方法
    public UserServiceImpl(int id, String user_name, String user_pwd, Date date) {
        this.id = id;
        this.user_name = user_name;
        this.user_pwd = user_pwd;
        this.date = date;
    }*/



    public void setId(int id) {
        this.id = id;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setUser_pwd(String user_pwd) {
        this.user_pwd = user_pwd;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", user_name='" + user_name + '\'' +
                ", user_pwd='" + user_pwd + '\'' +
                ", date=" + date +
                '}';
    }
    @Override
    public void saveUser() {
        System.out.println("保存了用户！！！");

    }
}

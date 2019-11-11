package com.mybatiesanno.pojo;

import java.util.List;

public class User {
    /*private int id;
    private String user_name;
    private String user_pwd;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_pwd() {
        return user_pwd;
    }

    public void setUser_pwd(String user_pwd) {
        this.user_pwd = user_pwd;
    }

    public User(int id, String user_name, String user_pwd) {
        this.id = id;
        this.user_name = user_name;
        this.user_pwd = user_pwd;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", user_name='" + user_name + '\'' +
                ", user_pwd='" + user_pwd + '\'' +
                '}';
    }*/

    private int uid;
    private String uuser_name;
    private String uuser_pwd;
    private List<Account> account;

    public List<Account> getAccount() {
        return account;
    }

    public void setAccount(List<Account> account) {
        this.account = account;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUuser_name() {
        return uuser_name;
    }

    public void setUuser_name(String uuser_name) {
        this.uuser_name = uuser_name;
    }

    public String getUuser_pwd() {
        return uuser_pwd;
    }

    public void setUuser_pwd(String uuser_pwd) {
        this.uuser_pwd = uuser_pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uuser_name='" + uuser_name + '\'' +
                ", uuser_pwd='" + uuser_pwd + '\'' +
                '}';
    }
}

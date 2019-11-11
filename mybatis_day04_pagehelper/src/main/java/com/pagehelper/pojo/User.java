package com.pagehelper.pojo;

/**
 * 关联usertb表 一对一关系（fk+uk）
 */
public class User {
    private int id;
    private String user_name;
    private String user_pwd;
//    一个类作为另一个类的成员变量
    private Card card;
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


    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", user_name='" + user_name + '\'' +
                ", user_pwd='" + user_pwd + '\'' +
                ", card=========>" + (card!=null?card.toString():null) +
                '}';
    }
}

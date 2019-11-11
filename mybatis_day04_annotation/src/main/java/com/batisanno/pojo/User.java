package com.batisanno.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * 关联usertb表 一对一关系（fk+uk）
 */
public class User implements Serializable {
    private int id;
    private String user_name;
    private String user_pwd;
    private Account account;
    private Card card;
    private List<Role> roleList;
    private List<RoleAndUserRelation> relationList;

    public List<RoleAndUserRelation> getRelationList() {
        return relationList;
    }

    public void setRelationList(List<RoleAndUserRelation> relationList) {
        this.relationList = relationList;
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
    //    一个类作为另一个类的成员变量

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


    /*@Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", user_name='" + user_name + '\'' +
                ", user_pwd='" + user_pwd + '\'' +
                ", account=" + (account!=null?account.toString():null) +
                '}';
    }*/

  /*  @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", user_name='" + user_name + '\'' +
                ", user_pwd='" + user_pwd + '\'' +
                ", account=" + (account!=null?account.toString():null) +
                ", card=" + (card!=null?card.toString():null) +
                '}';
    }*/

 /*   @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", user_name='" + user_name + '\'' +
                ", user_pwd='" + user_pwd + '\'' +
                ", roleList=" + (roleList!=null?roleList.toString():null) +
                '}';
    }*/


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", user_name='" + user_name + '\'' +
                ", user_pwd='" + user_pwd + '\'' +
                ", account=" + account +
                ", card=" + card +
                ", relationList=" + (relationList!=null?relationList.toString():null) +
                ", roleList=" + (roleList!=null?roleList.toString():null) +
                '}';
    }
}

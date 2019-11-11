package com.mybatis4.pojo;

import java.util.List;

public class Role {
    private int id;
    private int uid;
    private int rid;

    private String rolename;
    List<User> userList;

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", uid=" + uid +
                ", rid=" + rid +
                ", rolename=" + rolename +
                ", userList=" + (userList!=null?userList.toString():null) +
                '}';
    }
}

package com.springlistid.service.impl;

import com.springlistid.service.IUserService;

import java.util.*;

public class UserServiceImpl implements IUserService {
    private String[] myarr;
    private List<String> mylist;
    private Set<String> myset;
    private Map<String,String> mymap;
    private Properties myproper;

    public String[] getMyarr() {
        return myarr;
    }

    public void setMyarr(String[] myarr) {
        this.myarr = myarr;
    }

    public List<String> getMylist() {
        return mylist;
    }

    public void setMylist(List<String> mylist) {
        this.mylist = mylist;
    }

    public Set<String> getMyset() {
        return myset;
    }

    public void setMyset(Set<String> myset) {
        this.myset = myset;
    }

    public Map<String, String> getMymap() {
        return mymap;
    }

    public void setMymap(Map<String, String> mymap) {
        this.mymap = mymap;
    }

    public Properties getMyproper() {
        return myproper;
    }

    public void setMyproper(Properties myproper) {
        this.myproper = myproper;
    }

    @Override
    public String toString() {
        return "UserServiceImpl{" +
                "myarr=" + Arrays.toString(myarr) +
                ", mylist=" + mylist +
                ", myset=" + myset +
                ", mymap=" + mymap +
                ", myproper=" + myproper +
                '}';
    }

    @Override
    public void saveUser() {
        System.out.println("集合展示！！！");
        System.out.println(Arrays.toString(myarr));
        System.out.println(mylist);
        System.out.println(myset);
        System.out.println(mymap);
        System.out.println(myproper);
    }
}

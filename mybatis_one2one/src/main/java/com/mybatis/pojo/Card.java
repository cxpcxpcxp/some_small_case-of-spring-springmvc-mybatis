package com.mybatis.pojo;

public class Card {
    private int id;
    private int uid;
    private long cardNum;

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

    public long getCardNum() {
        return cardNum;
    }

    public void setCardNum(long cardNum) {
        this.cardNum = cardNum;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", uid=" + uid +
                ", cardNum=" + cardNum +
                '}';
    }
}

package com.example.homework.bean;

public class Student {
    private int sid;
    private String sName;
    private String sPassword;

    public int getSid(){
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsPassword() {
        return sPassword;
    }

    public void setsPassword(String sPassword) {
        this.sPassword = sPassword;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

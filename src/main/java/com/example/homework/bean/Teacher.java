package com.example.homework.bean;

public class Teacher {
    private int tid;
    private String tName;
    private String tPassword;

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String gettPassword() {
        return tPassword;
    }

    public void settPassword(String tPassword) {
        this.tPassword = tPassword;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

package com.example.homework.bean;

public class Homework {
    private int hid;
    private int tid;
    private String htitle;
    private String hcontent;
    private Long start_time;
    private Long end_time;

    public int getHid() {
        return hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getHtitle() {
        return htitle;
    }

    public void setHtitle(String htitle) {
        this.htitle = htitle;
    }

    public String getHcontent() {
        return hcontent;
    }

    public void setHcontent(String hcontent) {
        this.hcontent = hcontent;
    }

    public Long getStartTime() {
        return start_time;
    }

    public void setStartTime(Long startTime) {
        this.start_time = startTime;
    }

    public Long getEndTime() {
        return end_time;
    }

    public void setEndTime(Long endTime) {
        this.end_time = endTime;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

package com.example.homework.bean;
import com.example.homework.bean.Student;

public class studentHomework {
    private int id;
    private int sid;
    private int hid;
    private String homework_content;
    private Long create_time;
    private Long update_time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentId() {
        return sid;
    }

    public void setStudentId(int studentId) {
        this.sid = studentId;
    }

    public int getHomeworkId() {
        return hid;
    }

    public void setHomeworkId(int homeworkId) {
        this.hid = homeworkId;
    }

    public String getHomeworkContent() {
        return homework_content;
    }

    public void setHomeworkContent(String homeworkContent) {
        this.homework_content = homeworkContent;
    }

    public Long getCreateTime() {
        return create_time;
    }

    public void setCreateTime(Long createTime) {
        this.create_time = createTime;
    }

    public Long getUpdateTime() {
        return update_time;
    }

    public void setUpdateTime(Long updateTime) {
        this.update_time = updateTime;
    }

    public String toString(){
        return super.toString();
    }
}

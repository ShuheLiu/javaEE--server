package com.example.homework.service;


import com.example.homework.bean.studentHomework;
import com.example.homework.mapper.studentHomeworkMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentHomeworkService {

    @Autowired
    studentHomeworkMapper studentHomeworkMapper;

    public List<studentHomework> DetailHomeworkList(int hid){
        return studentHomeworkMapper.DetailHomeworkList(hid);
    }

    public List<studentHomework> myHomeworkList(int sid){
        return  studentHomeworkMapper.myHomeworkList(sid);
    }

    public int updateHomework(int id, String homework_content, Long update_time){
        return studentHomeworkMapper.updateHomework(id, homework_content, update_time);
    }

    public int addStudentHomework(studentHomework studentHomework){
        return studentHomeworkMapper.addStudentHomework(studentHomework);
    }

}

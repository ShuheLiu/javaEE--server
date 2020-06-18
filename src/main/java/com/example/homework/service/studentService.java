package com.example.homework.service;

import com.example.homework.bean.Student;
import com.example.homework.mapper.studentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentService {

    @Autowired
    studentMapper studentMapper;

    public Student Sel(int sid){
        return studentMapper.Sel(sid);
    }

    public List<Student> studentList(){
        return studentMapper.studentList();
    }

    public int insertStudent(Student student){
        return studentMapper.insertStudent(student);
    }

}

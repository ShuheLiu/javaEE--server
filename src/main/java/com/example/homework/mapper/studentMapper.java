package com.example.homework.mapper;

import com.example.homework.bean.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface studentMapper {
    Student Sel(int sid);

    List<Student> studentList();

    int insertStudent(Student student);

}

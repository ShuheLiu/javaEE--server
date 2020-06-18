package com.example.homework.mapper;


import com.example.homework.bean.Teacher;
import org.springframework.stereotype.Repository;

@Repository
public interface teacherMapper {

    int insertTeacher(Teacher teacher);

    Teacher select(int tid);
}

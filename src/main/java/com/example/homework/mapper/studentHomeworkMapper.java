package com.example.homework.mapper;

import com.example.homework.bean.studentHomework;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface studentHomeworkMapper {

    List<studentHomework> DetailHomeworkList(int hid);

    List<studentHomework> myHomeworkList(int sid);

    int updateHomework(int id, String homework_content, Long update_time);

    int addStudentHomework(studentHomework studentHomework);


}

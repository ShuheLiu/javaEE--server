package com.example.homework.mapper;

import com.example.homework.bean.Homework;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface homeworkMapper {

    List<Homework> homeworkList();

    List<Homework> ThomeworkList(int tid);

    int updateHome(Homework homework);

    int insertHomework(Homework homework);

    int deleteHomework(int hid);

}

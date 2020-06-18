package com.example.homework.controller;

import com.example.homework.bean.studentHomework;
import com.example.homework.service.studentHomeworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/homework")
@CrossOrigin
public class studentHomeworkController {
    @Autowired
    studentHomeworkService studentHomeworkService;

    @RequestMapping("/getDetailHomeworkList")
    public List<studentHomework> GetDetailHomeworkList(int hid){
        return studentHomeworkService.DetailHomeworkList(hid);
    }

    @RequestMapping("/getMyHomeworkList")
    public List<studentHomework> GetMyHomeworkList(int sid){
        return studentHomeworkService.myHomeworkList(sid);
    }

    @RequestMapping("/updateHomework")
    public String updateHomework(@RequestParam(value = "id") int id,
                                @RequestParam(value = "homework_content") String homework_content,
                                @RequestParam(value = "update_time") Long update_time){

        if(studentHomeworkService.updateHomework(id,homework_content,update_time)==1)
            return "Successful update";
        else {
            return "Update Fail";
        }
    }

    @RequestMapping("/insertHomework")
    public String insertSHomework(@RequestParam(value = "sid") int sid,
                                  @RequestParam(value = "hid") int hid,
                                  @RequestParam(value = "homework_content") String homework_content,
                                  @RequestParam(value = "create_time") Long create_time){
        studentHomework studentHomework=new studentHomework();
        studentHomework.setStudentId(sid);
        studentHomework.setHomeworkId(hid);
        studentHomework.setHomeworkContent(homework_content);
        studentHomework.setCreateTime(create_time);
        studentHomework.setUpdateTime(create_time);

        if(studentHomeworkService.addStudentHomework(studentHomework)==1)
            return "Successful Insert";
        else {
            return "Insert Fail";
        }
    }


}

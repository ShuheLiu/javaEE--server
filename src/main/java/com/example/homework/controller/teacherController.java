package com.example.homework.controller;

import com.example.homework.bean.Teacher;
import com.example.homework.service.teacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teacher")
@CrossOrigin
public class teacherController {
    @Autowired
    private teacherService teacherService;

    @RequestMapping("/login")
    public String CheckLogin(@RequestParam(value = "tid") int tid,
                             @RequestParam(value = "tPassword") String tPassword){

        Teacher teacher=teacherService.select(tid);

        if(teacher==null){
            return "Fail to login";
        }

        if(teacher.gettPassword().equals(tPassword)){
            return teacher.gettName();
        }else{
            return "Fail to login";
        }
    }

    @RequestMapping("/insertTeacher")
    public String insertStudent(@RequestParam(value = "tid") int tid,
                                @RequestParam(value = "tName") String tName,
                                @RequestParam(value = "tPassword") String tPassword){
        Teacher teacher=new Teacher();
        teacher.setTid(tid);
        teacher.settName(tName);
        teacher.settPassword(tPassword);

        if(teacherService.insertTeacher(teacher)==1)
            return "Successful insert teacher";
        else {
            return "Fail insert teacher";
        }
    }
}

package com.example.homework.controller;

import com.example.homework.bean.Student;
import com.example.homework.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class studentController {

    @Autowired
    private studentService studentService;
    @RequestMapping("/getStudent/{sid}")
    public String GetStudent(@PathVariable int sid){
        return studentService.Sel(sid).toString();
    }

    @RequestMapping("/login")
    public String checkStudentLogin(@RequestParam(value = "sid") int sid,
                                    @RequestParam(value = "sPassword") String sPassword){
        Student student=studentService.Sel(sid);
        if(student==null){
            return "Login fail";
        }
        if(sPassword.equals(student.getsPassword())){
            return student.getsName();
        }else {
            return "Login fail";
        }
    }

    @RequestMapping("/getStudentList")
    public List<Student> GetStudentList(){
        return studentService.studentList();
    }

    @RequestMapping("/insertStudent")
    public String insertStudent(@RequestParam(value = "sid") int sid,
                                @RequestParam(value = "sName") String sName,
                              @RequestParam(value = "sPassword") String sPassword){
        Student student=new Student();
        student.setSid(sid);
        student.setsName(sName);
        student.setsPassword(sPassword);
        if(studentService.insertStudent(student)==1)
           return "Successful insert";
        else {
            return "Fail insert";
        }
    }

}

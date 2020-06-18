package com.example.homework.controller;


import com.example.homework.bean.Homework;
import com.example.homework.service.homeworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/homework")
@CrossOrigin
public class homeworkController {
    @Autowired
    homeworkService homeworkService;

    @RequestMapping("/getHomeworkList")
    public List<Homework> GetHomeworkList(){
        return homeworkService.homeworkList();
    }

    @RequestMapping("/getTHomeworkList")
    public List<Homework> GetTHomeworkList(@RequestParam(value = "tid") int tid){
        return homeworkService.ThomeworkList(tid);
    }

    @RequestMapping("/addHomework")
    public String addHomework(@RequestParam(value = "tid") int tid,
                                 @RequestParam(value = "htitle") String htitle,
                                 @RequestParam(value = "hcontent") String hcontent,
                                 @RequestParam(value = "start_time") Long start_time,
                                 @RequestParam(value = "end_time") Long end_time){
        Homework homework=new Homework();
        homework.setTid(tid);
        homework.setHtitle(htitle);
        homework.setHcontent(hcontent);
        homework.setStartTime(start_time);
        homework.setEndTime(end_time);

        System.out.println(homework.getStartTime());

        if(homeworkService.insertHomework(homework)==1)
            return "Successful insert";
        else {
            return "Fail insert";
        }
    }

    @RequestMapping("/updateHome")
    public String updateHome(@RequestParam(value = "hid") int hid,
                              @RequestParam(value = "htitle") String htitle,
                              @RequestParam(value = "hcontent") String hcontent,
                              @RequestParam(value = "start_time") Long start_time,
                              @RequestParam(value = "end_time") Long end_time){
        Homework homework=new Homework();
        homework.setHid(hid);
        homework.setHtitle(htitle);
        homework.setHcontent(hcontent);
        homework.setStartTime(start_time);
        homework.setEndTime(end_time);

        if(homeworkService.updateHome(homework)==1)
            return "Successful update";
        else {
            return "Fail update";
        }
    }

    @RequestMapping("/deleteHomework")
    public String deleteHomework(@RequestParam(value="hid") int hid){
        if(homeworkService.deleteHomework(hid)==1){
            return "Successful delete";
        }else{
            return "Fail delete";
        }
    }

}

package com.lening.controller;

import com.alibaba.fastjson.JSON;
import com.lening.entity.StudentBean;
import com.lening.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author: 王浩
 * @Description:
 * @Date: Create in 9:51 2020/8/17
 */
@Controller
@RequestMapping("/sc")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/getStudentList")
    @ResponseBody
    public List<StudentBean> getStudentList(){
        //List<StudentBean> list =
        return studentService.getStudentList();
    }

    @RequestMapping("/AddStu")
    @ResponseBody
    public String AddStu(StudentBean studentBean){
        try {
            studentService.AddStu(studentBean);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "no";
        }
    }
}

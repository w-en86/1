package com.lening.service.impl;

import com.lening.entity.StudentBean;
import com.lening.mapper.StudentMapper;
import com.lening.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 王浩
 * @Description:
 * @Date: Create in 9:51 2020/8/17
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private  StudentMapper studentMapper;

    @Override
    public List<StudentBean> getStudentList() {
        return studentMapper.getStudentList();
    }

    @Override
    public void AddStu(StudentBean studentBean) {
        studentMapper.AddStu(studentBean);
    }
}

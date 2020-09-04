package com.lening.service;

import com.lening.entity.StudentBean;

import java.util.List;

/**
 * @Author: 王浩
 * @Description:
 * @Date: Create in 9:51 2020/8/17
 */
public interface StudentService {
    List<StudentBean> getStudentList();

    void AddStu(StudentBean studentBean);
}

package com.lening.mapper;

import com.lening.entity.StudentBean;

import java.util.List;

/**
 * @Author: 王浩
 * @Description:
 * @Date: Create in 9:50 2020/8/17
 */
public interface StudentMapper {
    List<StudentBean> getStudentList();

    void AddStu(StudentBean studentBean);
}

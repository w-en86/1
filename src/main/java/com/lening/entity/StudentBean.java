package com.lening.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: 王浩
 * @Description:
 * @Date: Create in 9:50 2020/8/17
 */
@Data
public class StudentBean implements Serializable {
    private Integer id;
    private String name;
    private Integer age;
    private String birthday;
    private String address;

}

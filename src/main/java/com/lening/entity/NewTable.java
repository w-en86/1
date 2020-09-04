package com.lening.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: 王浩
 * @Description:
 * @Date: Create in 10:02 2020/8/17
 */
@Data
public class NewTable implements Serializable {


    /*添加实体类*/
    private Integer id;
    private String name;
    private String cid;

}

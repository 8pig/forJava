package com.zhou.springboot04.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
//@TableName("user")
public class User {

    private Long id;

    @TableField("name") // user_name 表字段直接转换为userName 驼峰
    private String name;

    private String email;

    private Integer age;
}

package com.zhou.springboot04.pojo;

import lombok.Data;

@Data
public class User {

    private Long id;

    private String name;

    private String email;

    private Integer age;
}

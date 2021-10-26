package com.zhou.springboot04.controller;

import com.zhou.springboot04.pojo.User;
import com.zhou.springboot04.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("findAll")
    public List<User> findAll(){
        System.out.println(userService);
        return userService.findAll();
    }

    @GetMapping("findPage")
    public List<User> findPage(@RequestParam("page") Integer page,
                               @RequestParam("pageSize") Integer pageSize
                               ){
        return userService.findPage(page, pageSize);
    }
    @GetMapping("getById")
    public User getById (@RequestParam("id") Integer id) {
        return userService.findUserById(id);
    }


    @GetMapping("findAge")
    public List<User> findAge(@RequestParam("age") int age){
        return userService.findAge(age);
    }

    @GetMapping("save")
    public Long save(@RequestParam("name") String name) {
      return userService.save(name);
    }
}

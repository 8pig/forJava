package com.it.edu.info.manager.controller;

import com.it.edu.info.manager.dao.StudentDao;
import com.it.edu.info.manager.domain.Student;
import com.it.edu.info.manager.service.StudentService;

import java.util.Scanner;

public class StudentController {

    // 学生管理系统 菜单
    public void start() {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- 欢迎来到学生管理系统 ---");
        System.out.println("1.添加学生");
        System.out.println("2.删除学生");
        System.out.println("3.修改学生");
        System.out.println("4.查看所有学生");
        System.out.println("5.退出学生端");
        System.out.println("请输入序号: ");

        lo: while (true) {
            String text = sc.next();
            switch (text) {
                case "1":
                    System.out.println("添加");
                    addStudent();
                    break lo;
                case "2":
                    System.out.println("删除");
                    break;
                case "3":
                    System.out.println("修改");
                    break;
                case "4":
                    System.out.println("查看");

                    break;
                case "5":
                    System.out.println("退出学生端");
                    break lo;
                default:
                    System.out.println("无效操作");
            }
        }
    }

    public void addStudent() {

        StudentService studentService = new StudentService();
        Scanner sc = new Scanner(System.in);
        String id;
        lo: while (true) {
            System.out.println("请输入id");
            id = sc.next();
            int inIndex = studentService.getIndex(id);
            if(inIndex == -1){
                break lo;
            }else {
                System.out.println("id 已被占用，请重新输入");
            }
        }
        System.out.println("请输入姓名");
        String name = sc.next();
        System.out.println("年龄");
        String age = sc.next();
        System.out.println("生日");
        String birthday = sc.next();
        Student stu = new Student(id, name, age, birthday);

        boolean result =  studentService.addStudent(stu);
        if(result) {
            System.out.println("添加成功");
        }else {
            System.out.println("error 添加失败");
        }
    }
}

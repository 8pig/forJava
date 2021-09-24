package com.it.edu.info.manager.controller;

import com.it.edu.info.manager.dao.StudentDao;
import com.it.edu.info.manager.domain.Student;
import com.it.edu.info.manager.service.StudentService;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
    private StudentService studentService = new StudentService();
    Scanner sc = new Scanner(System.in);
    // 学生管理系统 菜单
    public void start() {


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
                    addStudent();
                    break lo;
                case "2":
                    deleteStuentById();
                    break;
                case "3":
                    System.out.println("修改");
                    break;
                case "4":
                    viewAllStudent();
                    break;
                case "5":
                    System.out.println("退出学生端");
                    break lo;
                default:
                    System.out.println("无效操作");
            }
        }
    }

    public void deleteStuentById() {

        System.out.println("请输入删除的id");
        String id = sc.next();
        int index = studentService.getIndex(id);
        if(index == -1) {
            System.out.println("查无此人");
            return;
        }
        studentService.deleteStudentById(id);
        System.out.println("删除成功");
    }

    public void viewAllStudent() {

        ArrayList<Student> students = studentService.viewAllStudent();
        if(students.size() > 0 && students != null) {
            System.out.println(students.toString());
            return;
        }
        System.out.println("暂无学生");
    }

    public void addStudent() {

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
        Student stu = new Student();
        stu.setAge(age);
        stu.setBirthday(birthday);
        stu.setName(name);
        // 如果使用有参构造方法 则需要 子类种调用super 方法

        boolean result =  studentService.addStudent(stu);
        if(result) {
            System.out.println("添加成功");
        }else {
            System.out.println("error 添加失败");
        }
    }
}

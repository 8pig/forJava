package com.pig.test;

import com.pig.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> studentArrayList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        lo:while (true) {
            System.out.println("-----欢迎来到管理系统-----");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看所有学生");
            System.out.println("5.退出");
            System.out.println("请输入序号: ");
            String checkNum = sc.next();
            switch (checkNum) {
                case "1":
                    addStudent(studentArrayList);
                    break;
                case "2":
                    System.out.println("del");
                    break;
                case "3":
                    System.out.println("editor");
                    break;
                case "4":
                    viewAllList(studentArrayList);
                    break;
                case "5":
                    System.out.println("感谢您的使用！");
                    break lo;
                default:
                    System.out.println("输入有误");
                    break;
            }
        }



    }
    public static void viewAllList (ArrayList<Student> studentArrayList) {
        if(studentArrayList.size() > 0) {
            System.out.println("学号\t\t姓名\t\t年龄\t\t");
            for (int i = 0; i < studentArrayList.size(); i++) {
                System.out.println(studentArrayList.get(i).getSid() + "\t\t" + studentArrayList.get(i).getName() + "\t\t" + studentArrayList.get(i).getAge() + "岁");
            }
            return;
        }
        System.out.println("学生列表为空");


    }
    /* 添加学生 */
    public static void addStudent(ArrayList<Student> studentArrayList) {
        /*
        * 1. 录入信息
        * 2. 封装学生
        * 3. 添加list中
        * 4. 给添加成功提示
        * */
        Scanner SC = new Scanner(System.in);
        System.out.println("输入学号");
        int sid = SC.nextInt();
        System.out.println("输入学生名称");
        String name = SC.next();
        System.out.println("输入学生年龄");
        int age = SC.nextInt();

        Student student = new Student(sid, name, age);
        studentArrayList.add(student);
        System.out.println("添加成功");


    }


}

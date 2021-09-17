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
                    deleteStu(studentArrayList);
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

    private static void deleteStu(ArrayList<Student> studentArrayList) {
        System.out.println("请输入要删除的学号");
        Scanner sc = new Scanner(System.in);
        String sid = sc.next();
        int index = findIndex(studentArrayList, sid);
        if(index == -1) {
            System.out.println("学号不存在");
        }else{
            studentArrayList.remove(index);
            System.out.println("删除成功");
        }
    }


    /* 查找学生是否存在  不存在-1 存在返回索引位置*/
    public static int findIndex (ArrayList<Student> list, String sid) {
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            if(s.getSid().equals(sid)) {
                index = i;
                break;
            }
        }
        return index;
    }


    /* 查看所有学生*/
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
        String sid = SC.next();
        System.out.println("输入学生名称");
        String name = SC.next();
        System.out.println("输入学生年龄");
        int age = SC.nextInt();

        Student student = new Student(sid, name, age);
        studentArrayList.add(student);
        System.out.println("添加成功");


    }


}

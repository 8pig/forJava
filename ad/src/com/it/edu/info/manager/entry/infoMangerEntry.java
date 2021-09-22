package com.it.edu.info.manager.entry;

import com.it.edu.info.manager.controller.StudentController;

import java.util.Scanner;

public class infoMangerEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("※※※※※ 管理系统 ※※※※※");
            System.out.println(" 1. 学生管理   2. 老师管理   3. 退出");
            String text = sc.next();
            switch (text) {
                case "1":
                    System.out.println("进入学生管理系统");
                    StudentController stc = new StudentController();
                    stc.start();
                    break;
                case "2":
                    System.out.println("2");
                    break;
                case "3":
                    System.out.println("退出");
                    // 退出当前正在运行的jvm虚拟机
                    System.exit(0);
                    break;
                default:
                    System.out.println("无效操作");
            }
        }
    }
}

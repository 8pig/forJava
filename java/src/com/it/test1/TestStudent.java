package com.it.test1;

import com.it.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = getStudent();
        Student s2 = getStudent();
        Student s3 = getStudent();
        ArrayList<Student> arr = new ArrayList<>();
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);

        System.out.println(arr);
        ArrayList<Student> newList = getList(arr);
        System.out.println(newList);
    }
    public static ArrayList<Student> getList (ArrayList<Student> oldList) {
        ArrayList<Student> list = new ArrayList<>();
        for (int i = 0; i < oldList.size(); i++) {
            Student s = oldList.get(i);
            int age = s.getAge();
            if(age < 18){
                list.add(s);
            }
        }
        return  list;
    }
    public static Student getStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名");
        String name = sc.next();
        System.out.println("请输入年龄");
        int age = sc.nextInt();
        return new Student(name, age);
    }
}

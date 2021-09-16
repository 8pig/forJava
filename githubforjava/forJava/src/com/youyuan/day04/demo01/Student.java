package com.youyuan.day04.demo01;

class Student extends Person{
    public Student(String name, int age) {
        super(name, age);
    }
    public void study (){
        System.out.println("我正在学习中");
    }
}
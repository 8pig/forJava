package com.youyuan.day04.demo01;


class Teachr extends Person{
    public Teachr() {
    }

    public Teachr (String name, int age) {
        super(name, age);
    }
    public void teach (){
        System.out.println("我正在学习中");
    }
}
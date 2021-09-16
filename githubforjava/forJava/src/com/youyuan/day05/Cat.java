package com.youyuan.day05;

public class Cat extends Animal {
    String name;


    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void eat (){
        System.out.println("猫吃鱼aaaa");
    }
    public void say (){
        System.out.println(this.name+"喵喵叫");
    }
}
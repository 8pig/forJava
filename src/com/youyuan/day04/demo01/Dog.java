package com.youyuan.day04.demo01;

public class Dog extends Animal {
    public Dog() {
    }
    public void eat (){
        System.out.println("狗吃肉");
    }
    public void say (){
        System.out.println(this.getLegLen()+"条腿"+", 颜色是"+this.getHairColor());
    }
}

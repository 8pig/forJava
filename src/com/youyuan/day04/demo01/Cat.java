package com.youyuan.day04.demo01;

public class Cat extends Animal {
    public Cat (){};
    public void eat() {
        System.out.println("猫吃鱼");
    }
    public void say (){
        System.out.println(this.getLegLen()+"条腿, " +"颜色是"+this.getHairColor());
    }
}

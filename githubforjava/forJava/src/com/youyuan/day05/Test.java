package com.youyuan.day05;

public class Test {
    public static void main (String[] args){
//        Cat c1 = new Cat();
//        c1.eat();
//        c1.setName("野猪");
//        System.out.println(c1.getName());




        Animal c2 = new Cat();  // 父类引用指向子类对象
        c2.eat();
        c2.setName("加菲猫");
        Cat c3 = (Cat)c2;
        c3.say();
        System.out.println(c3.getName());


        System.out.println("---");


        Animal c4 = new Cat();  // 父类引用指向子类对象
        c4.eat();
        c4.setName("咖啡毛");
        Cat c5 = (Cat)c4;
        c5.say();
        System.out.println(c5.getName());
    }
}

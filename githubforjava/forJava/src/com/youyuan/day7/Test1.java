package com.youyuan.day7;


public class Test1 {
    public static void main(String[] args) {
        com.youyuan.day05.Cat CCC = new com.youyuan.day05.Cat();
        CCC.eat();
        Cat C = new Cat();
        C.setName("拉菲");
        C.setAge(32);
        C.eat();
        C.sleep();
        JumpCat c1 = new JumpCat();
        c1.setName("aa");
        c1.setAge(12);
        c1.eat();
        c1.sleep();
        c1.jump();
    }
}

abstract class Animal {
    private String name;
    private int age;

    public Animal (){};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public abstract void eat ();
    public abstract void sleep ();
}
interface jumpting {
    public void jump ();
}

class Cat extends Animal {
    public Cat (){};

    @Override
    public void eat() {
        System.out.println("猫吃鱼");

    }

    @Override
    public void sleep() {
        System.out.println("猫侧着睡");
    }
}
class JumpCat extends Cat implements jumpting {
    public void jump (){
        System.out.println("猫跳高");
    }
}
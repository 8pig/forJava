package com.youyuan.day06;

public class Demo_Abstract {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setName("加菲猫");
        cat1.setAge(19);
        cat1.eat();
        cat1.catchMouse();
        System.out.println(cat1.getName()+cat1.getAge());
        /**/
        Dog dog1 = new Dog();
        dog1.setName("八公");
        dog1.setAge(20);
        dog1.eat();
        dog1.lookHome();
        System.out.println(dog1.getName()+dog1.getAge());
        Teach1 t1 = new Teach1();
        t1.setAge(19);
        t1.setName("嘎嘎");
        t1.teach();

    }

}

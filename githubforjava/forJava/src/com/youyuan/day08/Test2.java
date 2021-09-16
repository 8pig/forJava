package com.youyuan.day08;

public class Test2 {
    public static void main(String[] args) {

        PersonDemo pd = new PersonDemo();
        pd.methods(new Student());

        new Person(){
            public void show(){
                System.out.println("111");
            }
        };

    }
}

class PersonDemo {
    public void methods (Person p){
        p.show();
    }
}


abstract class Person {
    public abstract void show ();
}

class Student extends Person {
    @Override
    public void show() {
        System.out.println("shou");
    }
}
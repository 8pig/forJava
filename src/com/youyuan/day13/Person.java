package com.youyuan.day13;

import java.util.Objects;

public class Person {
    private String name;
    private  int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

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

    @Override
    public boolean equals(Object o) {
       Person p = (Person)o;
        return this.name.equals(p.name) && this.age == p.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

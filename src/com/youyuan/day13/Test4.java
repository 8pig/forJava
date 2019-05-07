package com.youyuan.day13;

import java.util.ArrayList;
import java.util.Iterator;

public class Test4 {
    public static void main(String[] args) {
        Person  p1 = new Person("gaga", 23);
        Person  p2 = new Person("aa", 2);
        Person  p3 = new Person("dd", 21);
        ArrayList<Person> list1 = new ArrayList<>();
        list1.add(p1);
        list1.add(p2);
        list1.add(p3);
//        for (int i = 0; i < list1.size() ; i++) {
//            System.out.println(list1.get(i));
//
//        }
        Iterator<Person> it = list1.iterator();
        Person tt;
        while (it.hasNext()){
            tt = it.next();
            System.out.println(tt.getAge()+","+tt.getName());
        }





    }
}

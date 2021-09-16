package com.youyuan.day12;

import com.youyuan.day11.Student;

import java.lang.reflect.Array;
import java.util.ArrayList;
@SuppressWarnings("rawtypes")
public class Collection {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        a1.add("avb");
        a1.add("c");
        a1.add("c");
        a1.add(new Student("adsa",12));
        System.out.println(a1.remove("C"));
        System.out.println(a1.toString());
        Object[] arr1 = a1.toArray();

        System.out.println(arr1);


    }

}

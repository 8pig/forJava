package com.youyuan.day12;

import com.youyuan.day11.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iterator1 {
    public static void main(String[] args) {

        Collection arr1 = new ArrayList();
        arr1.add(new Student("aa", 12));  // Object obj = new Student();  自动提示为OBJ了
        arr1.add(new Student("dd", 6));
        arr1.add(new Student("cc", 4));
        arr1.add(new Student("ee", 1));
        Iterator it = arr1.iterator();
        Object b = null;
        while(it.hasNext()){
            b = it.next();
            Student b1 = (Student)b;
            System.out.println(b1.getName()+"+"+b1.getAge());

        }





    }

    public static void demo1 (){
        Collection arr1 = new ArrayList();
        arr1.add(1);
        arr1.add(2);
        arr1.add(4);
        arr1.add(5);

        Iterator it = arr1.iterator(); // 获取迭代器
        Object b = null;
//        Object obj1 = it.next();
//        boolean b1 = it.hasNext();
//        System.out.println(b1 +","+ obj1);
//        Object obj2 = it.next();
//        boolean b2 = it.hasNext();
//        System.out.println(b2 +","+ obj2);
        while (it.hasNext()){
            b = it.next();
            System.out.println(b);
        }
    }
}

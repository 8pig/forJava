package com.youyuan.day10;

import java.util.ArrayList;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {

        ArrayList<String> arr1 = new ArrayList<>();
        System.out.println(arr1);
        System.out.println(arr1.add("11"));
        arr1.add(0,"22");
        System.out.println(arr1);
        ArrayList<String> arr2 = new ArrayList<>();

        arr2.add("野猪佩奇");
        arr2.add("黑猫警长");
        arr2.add("小熊维尼");
        arr2.add("光头像");

        for (int i = 0; i < arr2.size(); i++) {
            System.out.println(arr2.get(i));
        }
        ArrayList<Integer> arr3 = new ArrayList<>();
        // 生成6个 1~33 随机数 add
        Random a1 = new Random();

        for (int i = 0; i < 6; i++) {
            arr3.add(a1.nextInt(33)+1);
        }
        for (int i = 0; i < arr3.size(); i++) {
            System.out.println(arr3.get(i));

        }
        ArrayList<Student> arr4 = new ArrayList<>();
        Student s1 = new Student("洪七公", 20);
        Student s2 = new Student("欧阳锋", 21);
        Student s3 = new Student("黄药师", 22);
        Student s4 = new Student("段智兴", 23);
        arr4.add(s1);
        arr4.add(s2);
        arr4.add(s3);
        arr4.add(s4);
        System.out.println(arr4);
        for (int i = 0; i < arr4.size(); i++) {
            System.out.println(arr4.get(i).getName()+","+arr4.get(i).getAge());
        }

        printArrayList(arr2);



    }
    public static void printArrayList (ArrayList<String> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if(i == list.size() - 1){
                System.out.println(name + "}");
            }else {
                System.out.print(name + "@");
            }

        }

    }
}

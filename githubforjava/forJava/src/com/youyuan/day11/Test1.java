package com.youyuan.day11;

public class Test1 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = "DDD";
        String s4 = "ABC";
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println("----");
        System.out.println(s1.equalsIgnoreCase(s4));
        System.out.println(s1.startsWith("a"));
        System.out.println(s4.startsWith("A"));
        System.out.println("=-===========================================");
        Student ss1 = new Student("aa", 12);
        Student ss2 = new Student("bb", 12);
        Student ss3 = new Student("dd", 12);
        Student ss4 = new Student("cc", 12);
        Student ss5 = new Student("ee", 12);

        Student[] arr1 = new Student[5];

        arr1[0] = ss1;
        arr1[1] = ss2;
        arr1[2] = ss3;
        arr1[3] = ss4;

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }







    }
}

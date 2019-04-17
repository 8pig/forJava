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
    }
}

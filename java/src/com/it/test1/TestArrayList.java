package com.it.test1;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        extracted();
    }

    private static void extracted() {



        ArrayList<String> list = new ArrayList<>();
        list.add("an");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        boolean b1 = list.remove("4");
        boolean b2 = list.remove("aaaa");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(list);
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.remove(1);
        System.out.println(list1);
    }
}

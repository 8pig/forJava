package com.youyuan.day12;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        a1.add("a");
        a1.add("b");
        a1.add("c");
        a1.add("d");

        ArrayList a2 = new ArrayList();
        a2.add("a");
        a2.add("b");
        a2.add("z");
        a1.removeAll(a2);
        System.out.println(a1);
        System.out.println(a2);
        
        
        ArrayList a3 = new ArrayList();
        a3.add("a");
        a3.add("b");
        a3.add("z");
        a3.removeAll(a3);
        System.out.println(a3);
        System.out.println(a3);




    }
}

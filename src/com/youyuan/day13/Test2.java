package com.youyuan.day13;

import java.util.ArrayList;
import java.util.Iterator;

public class Test2 {
    public static void main(String[] args) {

        ArrayList arr = new ArrayList();
        arr.add(1);
        arr.add(2);
        arr.add(1);
        arr.add(2);
        arr.add(100);
        arr.add(2);
        arr.add(1);
        arr.add(3);
        arr.add(3);
        arr.add(4);
        System.out.println(getSingle2(arr));




    }

    public static ArrayList getSingle2 (ArrayList old) {
        ArrayList arr = new ArrayList();
        Iterator it = old.iterator();
        Object obg = null;


        while (it.hasNext()) {
            obg = it.next();
            if(!arr.contains(obg)){
                arr.add(obg);
            }
        }
        return arr;
    }
}

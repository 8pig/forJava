package com.youyuan.day13;

import com.sun.org.apache.bcel.internal.generic.RET;

import java.util.ArrayList;
import java.util.Iterator;

public class Test3 {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        list.add(new Person("张三", 22));
        list.add(new Person("李四", 23));
        list.add(new Person("王五", 21));
        list.add(new Person("李四", 23));
        System.out.println(list);
        System.out.println(getSingel(list));
    }

    public static ArrayList getSingel (ArrayList old){
        ArrayList arr = new ArrayList();
        Iterator it = old.iterator();
        Object ob;
        while (it.hasNext()){
            ob = it.next();
            if(! arr.contains( ob ) ){
                arr.add(ob);
            }
        }
        return arr;
    }


}

package com.youyuan.day13;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add(1);
        arr.add(2);
        arr.add(1);
        arr.add(2);
        arr.add(1);
        arr.add(3);
        arr.add(3);
        arr.add(4);
        System.out.println(getSingle1(arr));





    }
    /*
    * 创建新集合   返回不重复的arrlist
    * ArrayList 参数
    * ArrayList 返回
    * */

    public static ArrayList getSingle1 (ArrayList oldArr){
        ArrayList arr = new ArrayList<>();
        for (int i = 0; i < oldArr.size(); i++) {
            if( !arr.contains( oldArr.get(i) ) ){
                arr.add( oldArr.get(i) );
            };
        }
        return  arr;
    }



}

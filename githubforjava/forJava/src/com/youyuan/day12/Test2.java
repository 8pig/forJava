package com.youyuan.day12;

import java.util.ArrayList;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> bigList = new ArrayList<>();

        Random ra = new Random();
        Integer rd1;
        for (int i = 0; i < 20; i++) {
            rd1 = ra.nextInt(20) + 1;
            bigList.add(rd1);
        }
        System.out.println(bigList);



    }


}

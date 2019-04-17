package com.youyuan.day09;

import java.util.Random;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你猜的数字");
        int num1 = sc.nextInt();

        Random rd = new Random();
        int num2 = rd.nextInt(11);

        if(num1 == num2){
            System.out.println("猜对了");
        }else {
            System.out.println("猜错了");
        }
        System.out.println(num2);

    }
    
}

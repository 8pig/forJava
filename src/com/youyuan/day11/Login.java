package com.youyuan.day11;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名");
            String userName = sc.nextLine();
            System.out.println("----");
            System.out.println("请输入密码");
            String passWord = sc.nextLine();
            System.out.println("----");
            System.out.println(userName+","+ passWord);
            System.out.println(userName.length() +","+passWord.length());

            if("admin".equals(userName) && "admin".equals(passWord)){
                System.out.println("账号密码正确, 欢迎登陆");
                break;
            }else {
                if(i == 2){
                    System.out.println("错误次数已达上限, 请明天再来");
                }else {
                    System.out.println("错误, 您还有"+ (2 - i)+"次机会");
                }
            }

        }





    }
}

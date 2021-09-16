package com.youyuan.day11;

public class StringBuffer3 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("yezhupeiqi");
        sb.replace(0,1,"sb");
        System.out.println(sb);
        System.out.println("---------");
        String str = sb.substring(1,9);
        System.out.println(str);
    }
}

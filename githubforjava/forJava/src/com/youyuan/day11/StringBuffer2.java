package com.youyuan.day11;

public class StringBuffer2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("yezhupeiqi");
        sb.append(12345);
        sb.insert(1,9);
        System.out.println(sb);
        sb.deleteCharAt(0);
        System.out.println(sb);
        sb.delete(0,2);
        System.out.println(sb);
        sb.delete(0, sb.length());
        System.out.println(sb);
    }
}

package com.youyuan.day11;

public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        String str = "abc";
        StringBuffer sb1 = new StringBuffer(str);
        System.out.println(sb1.length()+","+sb1.capacity());
        System.out.println("-----------");
        StringBuffer sb2 = new StringBuffer();
        sb2.append(true);
        System.out.println(sb2);
        sb2.append("heima");
        System.out.println(sb2);
        sb2.append(100);
        System.out.println(sb2);
    }

}

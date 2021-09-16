package com.youyuan.day16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FS1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\区别浏览器.rar");
        FileOutputStream fos = new FileOutputStream("D:\\aa.rar");

        byte[] arr = new byte[10 * 1024];
        int len;

        while ((len = fis.read(arr)) != -1){
            fos.write(arr,0,len);
        }
        fos.close();
        fis.close();













    }
    public static void demo () throws IOException {
        //        FileInputStream fis = new FileInputStream("D:\\区别浏览器.rar");
        FileInputStream fis = new FileInputStream("a.txt");
        byte[] arr = new byte[2];

        int a = fis.read(arr);
        System.out.println(a);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        int b = fis.read(arr);
        System.out.println(b);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        int c = fis.read(arr);
        System.out.println(c);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        fis.close();
    }
}

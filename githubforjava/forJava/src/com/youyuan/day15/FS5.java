package com.youyuan.day15;

import java.io.FileInputStream;
import java.io.IOException;

public class FS5 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\区别浏览器.rar");
        byte[] arr = new byte[4];
        int a = fis.read(arr);
        System.out.println(a);
        for (byte v : arr) {
            System.out.println(v);

        }


        fis.close();
    }
}

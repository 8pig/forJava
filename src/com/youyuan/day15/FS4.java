package com.youyuan.day15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FS4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\区别浏览器.rar");
        FileOutputStream fos = new FileOutputStream("D:\\111.rar");
        int len = fis.available();
        byte[] arr = new byte[fis.available()];  // 创建与文件一样大小的字节数组
        fis.read(arr);      // 将文件的字节 读取到内存中;
        fos.write(arr);


        fis.close();
        fos.close();


    }
}

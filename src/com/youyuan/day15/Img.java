package com.youyuan.day15;

import java.io.*;

public class Img {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bif = new BufferedInputStream(new FileInputStream("C:\\Users\\Administrator\\Desktop\\12.jpg"));
        BufferedOutputStream bof = new BufferedOutputStream(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\3.jpg"));
        int b;
        while ((b = bif.read()) != -1){
            bof.write(b ^ 123);
        }
        bif.close();
        bof.close();





    }
}

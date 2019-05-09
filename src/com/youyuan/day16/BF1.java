package com.youyuan.day16;

import java.io.*;

public class BF1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("d:\\12.rar");
        FileInputStream fis = new FileInputStream("d:\\区别浏览器.rar");

        BufferedOutputStream bof = new BufferedOutputStream(fos);
        BufferedInputStream bif = new BufferedInputStream(fis);
        int b;
        while ((b = bif.read()) != -1){
            bof.write(b);
        }
        bof.close();
        bif.close();










    }
}

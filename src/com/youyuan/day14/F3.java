package com.youyuan.day14;

import java.io.File;
import java.io.IOException;

public class F3 {
    public static void main(String[] args) throws IOException {

        File f1 = new File("aaa");
        System.out.println(f1.mkdir() +","+ f1);
        File f2 = new File(f1, "d.txt");
        f2.createNewFile();




    }
    public static void demo1 () throws IOException {
        File file1 = new File("t1.txt");

        if( !file1.exists() ){
            file1.createNewFile();
            System.out.println("创建");
        }else {
            System.out.println("没创建");
        }
    }
}

package com.youyuan.day14;

import java.io.File;

public class F1 {
    public static void main(String[] args) {
        final String PARENT = "M:\\";
        String Child = "rarreg.key";
        File f1 = new File(PARENT, Child);
        System.out.println(f1.exists());




    }
    public static void d1 (){
        File file = new File("M:\\rarreg.key");
        System.out.println(file.exists());
        File file1 = new File("./day04.iml");
        System.out.println(file.exists());
        File file2 = new File("fff");
        System.out.println(file2.exists());
    }
}

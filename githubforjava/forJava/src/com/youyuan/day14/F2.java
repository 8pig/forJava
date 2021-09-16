package com.youyuan.day14;

import java.io.File;

public class F2 {
    public static void main(String[] args) {
        File f1 = new File("M:\\");
        String child = "rarreg.key";
        File f2 = new File(f1, child);
        System.out.println(f2.exists() +","+ f2);

    }
}

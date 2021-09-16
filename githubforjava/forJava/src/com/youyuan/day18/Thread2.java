package com.youyuan.day18;

public class Thread2 {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
        for (int i = 0; i < 10000; i++) {
            System.out.println("bbb");

        }
    }
}

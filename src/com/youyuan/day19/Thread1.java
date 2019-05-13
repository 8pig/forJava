package com.youyuan.day19;

public class Thread1 {
    public static void main(String[] args) {
        final Thread t1 = new Thread() {
            public void run (){
                for (int i = 0; i < 10; i++) {
                    System.out.println("aa");

                }
            }
        };
        Thread t2 = new Thread(){
            public void run () {
                for (int i = 0; i < 10; i++) {
                    if(i == 2){
                        try {
                            t1.join();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("bb");
                }

            }
        };
        t1.start();
        t2.start();
    }
}

package com.youyuan.day17;

public class JC1 {
    public static void main(String[] args) {
        System.out.println(JC(5));




    }
    public static int JC(int x){
        int result = 1;
        if(x == 1){
            return 1;
        }else {
            return  x * JC( x- 1);
        }
    }
}

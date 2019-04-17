package com.youyuan.day08;

public class Test1 {
    public static void main(String[] args) {
//        Outer.Inner i1 = new Outer().new Inner();
//        i1.print();
        Outer o1 = new Outer();
        o1.userInner();
    }
}

class Outer {
    int num = 0;
    private class Inner {
        public void print (){
            System.out.println(num);
        }
    }

    public void userInner (){
        Inner i = new Inner();
        i.print();
    }
}

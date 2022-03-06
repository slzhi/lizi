package com.object.o2_25.poly_.detail;


public class PolyDetail01 {

    public static void main(String[] args) {
        //属性没有重写之说
        Base base = new Sub();//向上转型
        System.out.println(base.count);//1
        Sub sub = new Sub();
        System.out.println(sub.count);//2
    }
}

class Base{
    int count = 1;
}

class Sub extends  Base{
    int count = 2;
}
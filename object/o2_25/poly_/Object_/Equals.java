package com.object.o2_25.poly_.Object_;

public class Equals {

    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = b;
        System.out.println(a == c);//true
        B bb = a;
        System.out.println(bb == a);//true


    }
}

class A extends B{

}

class B {

}
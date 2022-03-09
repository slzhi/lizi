package com.chapter10.codeblock3_7;

public class CodeBlockDetail02 {

    public static void main(String[] args) {
        A a = new A();//1 A静态代码块    2 getN1被调用  3 getN2被调用  4 A普通代码块    5 A（） 构造器
    }
}

class A{
    //普通代码块
    {
        System.out.println("A 普通代码块");
    }
    private  int n2 = getN2();
    static {
        System.out.println("A 静态代码块");
    }

    private static int n1 = getN1();
    public static int getN1(){
        System.out.println("getN1被调用");
        return 100;
    }
    public  int getN2(){
        System.out.println("getN2被调用");
        return 200;
    }
}

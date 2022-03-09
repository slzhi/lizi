package com.chapter10.static3_7;

//静态方法使用细节
public class StaticMethodDetail {

    public static void main(String[] args) {
        D.hi();//正确
        //D.say;错误,需要先创建对象，再调用
        new D().say();
    }
}

class D {

    private int n1 = 100;
    private static int n2 = 200;

    public void say() {//非静态方法

    }

    public static void hi() {//静态方法
        //类方法中不允许使用和对象有关的关键字
        //比如this和super。普通方法(成员方法)可以
    }

    //类方法(静态方法)中，只能访问静态变量或静态方法
    //静态方法只能访问静态成员
    public static void hello() {
        System.out.println(n2);
        System.out.println(D.n2);
        hi();//可以
        //say();错误，
    }
    //普通成员方法，既可以访问 非静态成员，也可以访问静态成员
    public void ok(){
        //非静态成员
        System.out.println(n1);
        say();
        //静态成员
        System.out.println(D.n2);
        D.hello();
    }
}

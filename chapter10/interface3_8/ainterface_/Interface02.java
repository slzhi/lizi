package com.chapter10.interface3_8.ainterface_;

public class Interface02 {

    public static void main(String[] args) {
        A a = new A();
        work(a);
    }
    public static void work(AInterface aInterface){
        aInterface.hi();
    }
}

/*
    1如果一个类，implements实现 接口
    2需要将该接口的所有抽象方法都实现
 */
class A implements AInterface {
    @Override
    public void hi() {
        System.out.println("hi()");
    }
}
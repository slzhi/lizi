package com.chapter10.interface3_8.interfaceDetail_;

public class interfaceDetail01 {

    public static void main(String[] args) {
        //new IA();
    }
}
/*
    1接口不能被实例化
    2接口中所有的方法时public方法，接口中抽象方法，可以不用abstract修饰
    3一个普通类实现接口，就必须将该接口的所有方法都实现\
    4抽象类实现接口，可以不用实现接口的方法
 */
interface IA{
    public abstract void say();
    void hi();
}

class Cat implements IA{
    @Override
    public void say() {
        System.out.println("say()");
    }
    @Override
    public void hi() {
        System.out.println("hi()");
    }
}

abstract class Dog implements IA{

}
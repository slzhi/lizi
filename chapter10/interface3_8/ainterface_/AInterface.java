package com.chapter10.interface3_8.ainterface_;

public interface AInterface {
    //属性
    public int n1 = 10;
    //方法
    //在接口中，抽象方法可以省略abstract关键字不写
    public void hi();
    //jdk8后，可以有默认实现方法，需要使用default关键字修饰
    default public void ok(){
        System.out.println("ok()");
    }
    //JDK8后，可以有静态方法
    public static void cry(){
        System.out.println("cry()");
    }
}

package com.chapter10.abstract3_8;
//抽象类使用的注意事项和细节
public class abstractDetail01 {

    public static void main(String[] args) {
        //抽象类，不能被实例化
        //new A();
    }
}

//抽象类不一定要包含abstract方法。也就是说，抽象类可以没有abstract方法
abstract class A{
    public void hi(){
        System.out.println("hi");
    }
}

//一旦类包含了abstract方法，则这个类必须声明abstract。
abstract class B{
    public abstract void hi();
}

//abstract只能修饰类和方法，不能修饰属性和其它。
class C{
    //public abstract int n1 = 1;
}
package com.chapter10.abstract3_8;
//抽象类使用的注意事项和细节
public class abstractDetail02 {

    public static void main(String[] args) {

    }
}

//抽象类的本质还是类,可以有类的各种成员

abstract class D{
    public int n1 = 10;
    public static String name = "小黑";
    public void hi(){
        System.out.println("hi");
    }
    public abstract void hello();
    public static void ok(){
        System.out.println("ok");
    }
}

//如果一个类继承了抽象类，则它必须抽象类的所有抽象方法，除非它自己也声明为abstract类。
abstract class E{
    public abstract void hi();
}
abstract class F extends E{ }
class G extends E{
    @Override
    public void hi() {//相当于G子类实现了父类E的抽象方法

    }
}

//抽象方法不能使用private、final和static来修饰，因为这些关键字都是和重写相违背的。
abstract class H{
    public abstract void hi();//抽象方法
}

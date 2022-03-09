package com.chapter10.codeblock3_7;

public class CodeBlockDetail01 {

    public static void main(String[] args) {
        //1类被加载的情况举例
        //AA aa = new AA();
        //2创建子类对象实例，父类也会被加载
        AA aa = new AA();
        //3实用类的静态成员时(静态属性,静态方法)
        System.out.println(Cat.n1);
        System.out.println(DD.n1);
        //static代码块，是在类加载时，执行的，而且只会执行一次
        DD dd = new DD();
        DD dd1 = new DD();

        /*
            普通的代码块，在创建对象实例时，会被隐式调用
            被创建一次，就调用一次
            如果只是使用类的静态成员时，普通代码块并不会执行
         */


    }
}

class DD{
    public static int n1 = 888;
    static {
        System.out.println("DD 静态代码块1被执行");
    }

    //普通代码块,在new对象时，被调用而且是每创建一个对象，就调用一次(普通代码块就是构造器的补充)
    {
        System.out.println("DD 静态代码块1被执行");
    }

}

class Cat {

    public static int n1 = 999;
    //静态代码块
    static {
        System.out.println("cat 静态代码块1被执行");
    }
}

class BB {
    //静态代码块
    static {
        System.out.println("BB 静态代码块1被执行");
    }
}

class AA extends BB {

    //静态代码块
    static {
        System.out.println("AA 静态代码块1被执行");
    }
}

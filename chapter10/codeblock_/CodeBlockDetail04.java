package com.chapter10.codeblock_;

public class CodeBlockDetail04 {

    public static void main(String[] args) {
    /*
        1.进行类的加载
            1.1先加载父类A01         1.2在加载子类B02
        2.创建对象
        2.1 从子类的构造器开始
    */
        new B01();
    }
}

class A01{
    private static int n1 = getVal01();
    static {
        System.out.println("A01：一个静态代码块");//2
    }
    {
        System.out.println("A01：一个普通代码块");//5
    }
    public int n3 = getVal02();//普通属性初始化
    public static int getVal01(){
        System.out.println("getVal01 静态方法");//1
        return 10;
    }

    public int getVal02(){
        System.out.println("getVal02 普通方法");//6
        return 10;
    }

    public A01() {
        //隐藏了super()
        //隐藏了普通代码块和普通属性初始化
        System.out.println("A01 构造器");//7
    }
}

class B01 extends  A01{
    private static int n3 = getVal03();
    static {
        System.out.println("B01的一个静态代码块...");//4
    }
    public int n5 = getVal04();//普通属性初始化
    {
        System.out.println("B01的一个普通代码块...");//9
    }
    public static int getVal03(){
        System.out.println("getVal03 静态方法");//3
        return 10;
    }

    public static int getVal04(){
        System.out.println("getVal04 普通方法");//8
        return 10;
    }

    public B01(){
        //隐藏了super()
        //隐藏了普通代码块
        System.out.println("B01 构造器");//10
    }

}
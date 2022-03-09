package com.chapter10.main3_7;

public class Main01 {
    private static String name = "业精于勤，荒于嬉。行成于思，毁于随";
    private int n1 = 1000;

    private  static  void hi(){
        System.out.println("Main01:hi()");
    }
    public void cry(){
        System.out.println("Main01:car()");
    }

    public static void main(String[] args) {
        //可以直接使用name
        //1.静态方法
        System.out.println("name="+name);
        hi();
        //2.静态方法main 不可以访问本类的非静态成员
        //System.out.println(n1);
        //3.静态方法main 访问本类的非静态成员，需先创建对象再调用
        Main01 main01 = new Main01();
        System.out.println(main01.n1);
        main01.cry();
    }
}

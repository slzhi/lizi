package com.object.o2_23.extend.improve_;

public class Sub extends Base {//子类

    public Sub(String name,int age){
        //调用父类的无参构造器，如下或者什么都不写
        // super();
        //调用父类的构造器Base(String name)
        super("java");
        //super在使用时，必须在构造器第一行
        //super()和this()都只能放在构造器第一行，因此这两个方法不能共存在一个构造器
    }


    public Sub() {//构造器
        System.out.println("sub()..");
    }

    public void sayOk() {//子类方法
        //我们发现父类的非private(私有)属性和方法都可以访问
        //但是私有属性和方法不能再子类直接访问
        System.out.print(n1 + " " + n2 + " " + n3 + "\t");

        test10();
        test20();
        test30();
        //test40();错误
        //要通过父类提供的方法区访问
        System.out.println("n4=" + getN4());
        callTest40();//调用父类私有方法
    }
}

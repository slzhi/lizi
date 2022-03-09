package com.chapter10.innerClass3_9;

//匿名内部类的细节
public class AnonymousInnerClassDetail {

    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.f1();
        //外部其它类-不能访问→匿名内部类
        System.out.println("main outer05 hashcode="+outer05);
    }
}

class Outer05 {

    private int n1 = 99;

    public void f1() {
        //创建一个基于类的匿名内部类
        //不能添加访问修饰符，因为它的地位就是一个局部变量
        //作用域：仅仅在定义它的方法或代码块中
        Person person = new Person() {
            private int n1 = 88;
            @Override
            public void hi() {
                //可以直接访问外部类的所有成员，包含私有的
                //如果外部类和内部类的成员重名时，匿名内部类访问的话，默认遵循就近原则，
                // 如果想访问外部类的成员，则可以使用(外部类名.this.成员)去访问
                System.out.println("匿名内部类重写了 hi() n1=" + n1+" 外部类的n1="+Outer05.this.n1);
                //Outer05.this 就是调用 f1的 对象
                System.out.println("Outer05.this hashcode="+Outer05.this);
            }
        };
        person.hi();//动态绑定,运行类型是Outer05$1
        //也可以直接调用
        //class 匿名内部类 extends Person{}
/*        new Person(){
            @Override
            public void hi() {
                System.out.println("匿名内部类重写了 hi()....");
            }
        }.ok("jack");*/
    }
}

class Person {

    public void hi() {
        System.out.println("Person hi()");
    }

    public void ok(String name) {
        System.out.println("Person ok()" + name);
    }
}

//抽象类/接口
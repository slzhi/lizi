package com.chapter10.innerClass3_9;
//演示局部内部类的使用
public class LocalInnerClass {

    public static void main(String[] args) {
        //Inner02 inner02 = new Inner02();外部其他类-不能访问→局部内部类(局部内部类是定义一个局部变量)
        Outer02 outer02 = new Outer02();
        outer02.m1();
        System.out.println("Outer02.this hashcode="+outer02);
    }
}

class Outer02 {//外部类
    private int n1 = 100;
    private void m2(){//私有方法
        System.out.println("m2()");
    }
    public void m1() {//方法
        /*
            1.局部内部类是定义在外部类的局部位置，通常在方法
            3.不能添加访问修饰符，但是可以使用final修饰
             4.作用域：仅在定义它的方法或代码块中

         */
         class Inner02 {//局部内部类(本质仍然还是一个类)
            //2.可以直接访问外部类的所有成员，包括私有
            private int n1 = 200;
            public void f1() {
                //5.局部内部类可以直接访问外部成员，比如下面 n1 和 m2()
                //7.如果外部类和局部内部类的成员重名时，默认遵循就近原则，如果想访问外部类的成员，
                //  使用外部类名.this.成员 去访问
                System.out.println("n1=" + n1 +" 外部类n1="+Outer02.this.n1);
                System.out.println("Outer02.this hashcode="+Outer02.this);
                m2();//正确
            }
        }
        //6外部类在方法中，可以创建Inner02对象，然后调用方法即可
        Inner02 inner02 = new Inner02();
         inner02.f1();
    }
    {//代码块
        class Inner03{}
    }
}

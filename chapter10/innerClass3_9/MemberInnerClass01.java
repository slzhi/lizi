package com.chapter10.innerClass3_9;

import com.chapter10.innerClass3_9.Outer08.Innter08;

//成员内部类
public class MemberInnerClass01 {

    public static void main(String[] args) {
        Outer08 outer08 = new Outer08();
        outer08.t1();
        //外部其他类，使用成员内部类的三种方式：
        // 第一种方式：outer08.new Innter08();相当于把new Inner08()当做是outer08成员
        Outer08.Innter08 innter08 = outer08.new Innter08();
        //第二种方式：在外部类中，编写一个方法，可以返回Innter08方法
        Outer08.Innter08 inner08Instance = outer08.getInner08Instance();
        inner08Instance.say();
        //第三种方式：
        Innter08 innter081 = new Outer08().new Innter08();
    }
}


class Outer08 {//外部类
    private int n1 = 10;
    public String name = "张三";

    private void hi(){
        System.out.println("hi()");
    }

    //  1.注意：成员内部类，是定义在外部类的成员位置
    //  2.可以添加任意访问修饰符(public、protected、默认、private)，因为它的低位就是一个成员。
    class Innter08 {//成员内部类
        private double sal = 8.8;
        private int n1 = 66;
        public void say() {
            //可以直接访问外部类的所有成员，包含私有的
            //如果成员内部类的成员和外部类的成员重名，会遵守就近原则
            //可以通过  外部类名.this.属性    来访问外部类的成员
            System.out.println("n1=" + n1 + " name=" + name+" 外部类n1="+Outer08.this.n1);
            hi();
        }
    }
    //方法，返回一个Innter08实例
    public Innter08 getInner08Instance(){
        return new Innter08();
    }

    public void t1() {
        //使用成员内部类
        Innter08 innter08 = new Innter08();
        innter08.say();
    }
}
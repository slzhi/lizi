package com.chapter10.innerClass3_9;

//演示匿名类内部类的使用
public class AnonymousInnerClass {

    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}

class Outer04 {//外部类
    private int n1 = 10;//属性

    public void method() {//方法
        /*
            演示基于接口的匿名内部类
            1.需求：想使用IA接口，并创建对象
            2.传统方式，写一个类，实现该接口，并创建对象
            3.需求：Tiger 类只使用一次，后面不再使用
            4.可以使用匿名内部类简化开发
            5.tiger的编译类型 IA
            6.tiger的运行类型 就是匿名内部类
                底层会分配 类名 Outer04$1
                class Outer04$1 implements IA{
                    @Override
                     public void cry() {
                        System.out.println("老虎：嗷呜嗷呜嗷呜");
                     }
                }
            7.jdk底层在创建匿名内部类 Outer04$1 ，马上就创建了 Outer04$1 实例，并且把地址返回给 tiger
            8.匿名内部类使用一次，就不能在使用
         */
        IA tiger = new IA() {
            public void cry() {
                System.out.println("老虎：嗷呜嗷呜~");
            }
        };
        System.out.println("tiger的运行类型=" + tiger.getClass());
        tiger.cry();
        System.out.println();

        /*
            演示基于类的匿名内部类
            1.father 编译类型 Father
            2.father 运行类型 Outer04$2
            3.底层会创建匿名内部类
                class Outer04$2 extends Father{
                }
         */
        Father father = new Father("jack") {
            @Override
            public void test() {
                System.out.println("匿名内部类重写了test方法");
            }
        };
        System.out.println("father对象的运行类型="+father.getClass());//Outer04$2
        father.test();
        System.out.println();
        /*
            基于抽象类的匿名内部类

         */
        Animal animal = new Animal(){

            @Override
            void eat() {
                System.out.println("小狗吃骨头");
            }
        };
        System.out.println("animal对象的运行类型="+animal.getClass());
        animal.eat();

    }
}

interface IA {//接口

    public void cry();
}

/*class Tiger implements IA{
    @Override
    public void cry() {
        System.out.println("老虎：嗷呜嗷呜嗷呜");
    }
}
class Dog implements IA{
    @Override
    public void cry() {
        System.out.println("小狗：嗷呜嗷呜");
    }
}*/

class Father {

    public Father(String name) {//构造器
        System.out.println("name="+name);
    }

    public void test() {//方法

    }
}

abstract class Animal{//抽象类
    abstract void eat();
}
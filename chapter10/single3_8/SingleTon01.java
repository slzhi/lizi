package com.chapter10.single3_8;
//单例模式-饿汉式
public class SingleTon01 {

    public static void main(String[] args) {
        //通过方法可以获取对象
//        GirlFriend instance = GirlFriend.getInstance();
//        System.out.println(instance);
        System.out.println(GirlFriend.n1);
    }
}


class GirlFriend{
    private String name;
    public static int n1 = 100;
    //为了能够在静态方法中，返回gf对象，需要将其修饰为static
    //对象，通常是重量级的对象，饿汉式可能造成创建了对象，但是没有使用。
    private static GirlFriend gf = new GirlFriend("小白");


    /*
        如何保障职能创建一个 GirlFriend 对象
        单例模式-饿汉式
        1将构造器私有化
        2在类的内部直接创建
        3提供一个公共的static方法，返回gf对象
     */


    private GirlFriend(String name) {
        System.out.println("构造器被调用");
        this.name = name;
    }

    public static GirlFriend getInstance(){
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}
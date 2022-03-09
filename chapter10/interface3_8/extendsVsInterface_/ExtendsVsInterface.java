package com.chapter10.interface3_8.extendsVsInterface_;
//继承和接口的区别
/*
    小结：
        1.当子类继承了父类，就自动的拥有父类的功能。
        2.如果子类需要扩展功能，可以通过实现接口的方式扩展
        3.a可以理解为 实现接口是对java单继承机制的一种补充
 */
public class ExtendsVsInterface {

    public static void main(String[] args) {
        LittleMonkey littleMonkey = new LittleMonkey("六耳猕猴");
        littleMonkey.climbing();
        littleMonkey.swimming();
        littleMonkey.flying();
    }
}

//猴子
class Monkey{
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public void climbing(){
        System.out.println(name+"会爬树");
    }

    public String getName() {
        return name;
    }
}
//接口
interface Fishable{
    void swimming();
}

interface Birdable{
    void flying();
}

//继承
class LittleMonkey extends Monkey implements Fishable,Birdable{
    public LittleMonkey(String name) {
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println(getName()+"通过学习，学会游泳");
    }

    @Override
    public void flying() {
        System.out.println(getName()+"同过学习，学会飞翔");
    }
}



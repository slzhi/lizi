package com.Chapter11.enum3_9;

public class Enumeration02 {

    public static void main(String[] args) {
        System.out.println(Season02.SPRING);
        System.out.println(Season02.SUMMER);

    }
}

//演示自定义枚举实现
class Season02{
    private String name;
    private String desc;//描述

    //定义了四个对象,固定
    public final static Season02 SPRING = new Season02("春天", "温暖");
    public final static Season02 SUMMER = new Season02("夏天", "炎热");
    public final static Season02 AUTUMN = new Season02("秋天", "凉快");
    public final static Season02 WINTER = new Season02("冬天", "寒冷");

    //1.将构造器私有化，目的防止    直接  new
    //2.去掉setXxx方法，防止属性被修改
    //3.在Season 内部，直接创建固定的对象
    //4.优化，可以加入 final 修饰符
    private Season02(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season01{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
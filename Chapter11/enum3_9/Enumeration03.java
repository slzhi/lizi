package com.Chapter11.enum3_9;

public class Enumeration03 {

    public static void main(String[] args) {
        System.out.println(Season03.SPRING);
    }
}
//演示使用enum关键字来实现枚举类
enum Season03{

    //1.如果使用了 enum 替代 class
    //2.public static final Season SPRING = new Season("春天","温暖")直接使用
    //SPRING("春天","温暖")解读：常量名(实参列表)
    //3.如果有多个常量(对象)，使用，间隔即可
    //4.如果使用enum来实现枚举，要求将定义常量对象，写在前面
    SPRING("春天","温暖"),WINTER("夏天", "炎热"),AUTUMN("秋天", "凉快"),SUMMER("冬天", "寒冷");
    private String name;
    private String desc;//描述


    private Season03(String name, String desc) {
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
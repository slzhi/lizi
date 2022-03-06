package com.object.o2_25.poly_;

public class Master {

    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//    使用多态机制，可以统一的管理主人喂食的问题
//    animal编译类型，可以指向(接收)Animal子类的对象
//    food编译类型，可以指向(接收)food子类的对象
    public void feed(Animal animal,Food food){
        System.out.println("主人：" + name + " 给" + animal.getName() + " 吃 " + food.getName());
    }

//    //给小狗喂食物
//    public void feed(Dog dog, Bone bone) {
//        System.out.println("主人：" + name + " 给" + dog.getName() + " 吃 " + bone.getName());
//    }
//    给小猫喂食物
    public void feed(Cat cat,Fish fish){
        System.out.println("主人：" + name + " 给" + cat.getName() + " 吃 " + fish.getName());
    }
}

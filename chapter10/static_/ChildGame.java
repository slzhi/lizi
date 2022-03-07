package com.chapter10.static_;


public class ChildGame {

    public static void main(String[] args) {
        Child child = new Child("小黑");
        child.join();
        child.count++;
        Child child1 = new Child("小白");
        child1.join();
        child1.count++;
        Child child2 = new Child("小红");
        child2.join();
        child2.count++;
        System.out.println(child2.count);
    }
}

class Child {

    public static int count = 0;
    private String name;

    public Child(String name) {
        this.name = name;
    }

    public void join() {
        System.out.println(name + "加入游戏");
    }
}
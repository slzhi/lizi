package com.object.o2_23.extend.improve_;

//父类，是Pubil和Graduate的父类
public class Student {
    //公有属性
    public String name;
    public int age;
    public double score;//成绩

    //公有方法
    public void setScore(double score) {
        this.score = score;
    }

    public void showInfo() {
        System.out.println("学生名字：" + name + " 年龄:" + age + " 成绩:" + score);
    }
}


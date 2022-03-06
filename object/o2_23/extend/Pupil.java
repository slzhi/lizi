package com.object.o2_23.extend;

//小学生类→模拟小学生考试情况
public class Pupil {

    public String name;
    public int age;
    public double score;//成绩

    public void setScore(double score) {
        this.score = score;
    }

    public void testing() {
        System.out.println("小学生" + name + "正在考小学数学..");
    }

    public void showInfo() {
        System.out.println("学生名字：" + name + " 年龄:" + age + " 成绩:" + score);
    }
}

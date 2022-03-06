package com.smallchange.s3_1.homework.homework13;

public class Teacher extends Person{
    private int work_age;

    public Teacher(String name, int age, char sex, int work_age) {
        super(name, age, sex);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }
    public String  teach(){
        return "我承诺，我会认真教学";
    }

    @Override
    public String play() {
        return super.play()+"爱下象棋";
    }



    @Override
    public String printInfo() {
        return "教师的信息：\n"+super.printInfo()+"工龄："+work_age+"\n"+teach()+"\n"+play();
    }
}

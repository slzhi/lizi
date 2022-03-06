package com.smallchange.s3_1.homework.homework13;

public class Student extends Person{
    private int stu_id;

    public Student(String name, int age, char sex, int stu_id) {
        super(name, age, sex);
        this.stu_id = stu_id;
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }
    public String study(){
        return "我承诺，我会好好学习";
    }

    @Override
    public String play() {
        return super.play()+"爱玩足球";
    }

    @Override
    public String printInfo() {
        return "学生的信息：\n"+super.printInfo()+"学号："+stu_id+"\n"+study()+"\n"+play();
    }
}

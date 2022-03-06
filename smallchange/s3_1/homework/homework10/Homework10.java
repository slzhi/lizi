package com.smallchange.s3_1.homework.homework10;

public class Homework10 {

    public static void main(String[] args) {
        Doctor doctor = new Doctor("小黑",20,"骨科医生",'男',20000);
        Doctor doctor1 = new Doctor("小黑",20,"骨科医生",'男',20000);
        System.out.println(doctor.equals(doctor1));
    }
}

class Doctor{
    private String name;//姓名
    private int age;//年龄
    private String job;//工作
    private char gender;//性别
    private double sal;

    public Doctor(String name, int age, String job, char gender, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    //重写父类equals()方法:public boolean equals(Object obj),并判断测试类
    public boolean equals(Object obj){
        //判断两个比较对象是否相同
        if (this == obj){
            return true;
        }
        //判断Obj是否是Doctor类型或其子类
        if(!(obj instanceof  Doctor)){
            return false;
        }

        //向下转型，因为obj的运行类型是Doctor或者其子类型
        Doctor doctor = (Doctor)obj;
        return this.name.equals(doctor.name) && this.age == doctor.age&&this.gender == doctor.gender
                && this.job.equals(doctor.job)&& this.sal == doctor.sal;
    }
}
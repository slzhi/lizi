package com.smallchange.s3_1.homework.homework13;

public class Person {//父类
    private String name;
    private int age;
    private char sex;


    public Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String play(){
        return name;
    }

    public String printInfo(){
        return "姓名："+name+"\n年龄："+age+"\n性别:"+sex+"\n";
    }
}

package com.object.o2_25.poly_.polyarr_;

public class Student extends Person {

    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    //重写父类say
    public String say() {
        return super.say() + " score=" + score;
    }

    public void study() {
        System.out.println("学生" + getName() + "正在听课");
    }
}

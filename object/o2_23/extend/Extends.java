package com.object.o2_23.extend;

public class Extends {

    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "小黑";
        pupil.age = 10;
        pupil.score = 60.6;
        pupil.testing();
        pupil.setScore(20);
        pupil.showInfo();

        Graduate graduate = new Graduate();
        graduate.name = "小明";
        graduate.age = 20;
        graduate.testing();
        graduate.setScore(30);
        graduate.showInfo();
    }
}

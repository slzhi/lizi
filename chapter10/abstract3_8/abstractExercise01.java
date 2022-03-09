package com.chapter10.abstract3_8;

public class abstractExercise01 {

    public static void main(String[] args) {
        Manager manager = new Manager("小黑", 99, 20000,200);
        manager.work();
        CommonEmployee commonEmployee = new CommonEmployee("小白", 88, 10000);
        commonEmployee.work();
    }
}

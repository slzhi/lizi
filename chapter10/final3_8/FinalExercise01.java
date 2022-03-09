package com.chapter10.final3_8;

//请编写一个程序，能计算圆形的面积。要求圆周率为3.14赋值的位置3个方式都写一遍
public class FinalExercise01 {

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.calArea());
    }
}


class Circle {

    private double radius;
    private final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
        //PI=3.14
    }
    {
       // PI = 3.14;
    }

    public double calArea(){
        return PI * radius *radius;
    }
}
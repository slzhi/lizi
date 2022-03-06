package com.smallchange.s3_1.homework.homework09;

public class Homework09 {

    public static void main(String[] args) {
        LabeledPoint blackThursday = new LabeledPoint("BlackThursday", 1929, 230.07);
        blackThursday.print();
    }
}

class Point{

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void print(){
        System.out.println(+x+","+y);
    }
}

class LabeledPoint extends Point{
    private String name;

    public LabeledPoint(String name, double x, double y) {
        super(x, y);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name+","+getX()+","+getY());
    }
}
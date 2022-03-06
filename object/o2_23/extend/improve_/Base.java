package com.object.o2_23.extend.improve_;

public class Base {
    //四个属性
    public int n1 = 10;
    protected  int n2 = 20;
    int n3 = 30;
    private  int n4 = 40;

    //无参构造器
    public Base() {
        System.out.println("Base()..");
    }

    public Base(String name) {
        System.out.println("父类Base(String name)构造器");
    }

    public void test10(){
        System.out.println("test10()..");
    }

    protected void test20(){
        System.out.println("test20()..");
    }

    void test30(){
        System.out.println("test30()..");
    }

    private void test40(){
        System.out.println("test40()..");
    }

    public int getN4() {
        return n4;
    }

    public void callTest40(){
        test40();
    }
}

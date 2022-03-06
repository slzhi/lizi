package com.smallchange.s2_28.homework;
/*
通过继承实现员工工资核算打印功能：
		父类：员工类
		子类：部门经理类、普通员工类
            1部门经理工资=1000+单日工资*天数*等级(1.2)→奖金+基本工资
            2普通员工工资=单日工资*天数*等级(1.0);
            3员工属性：姓名，单日工资，工作天数
            4员工方法(打印工资)
            5普通员工及部门经理都是员工子类，需要重写打印工资方法。
            6定义并初始化普通员工对象，调用打印工资方法输入工资，
                定义并初始化部门经理对象，调用打印工资方法输入工资
 */
public class Homework03 {

    public static void main(String[] args) {
        Manager manager = new Manager("张三", "经理", 200, 7, 1.2,1000);
        manager.printSal();
        Worker worker = new Worker("李四", "员工", 100, 7, 1);
        worker.printSal();
    }
}
//父类：员工
class Employee{
    private String name;
    private String post;//职位
    private double dailyWage;//单日工资
    private int workDays;//天数
    private double grade;//等级

    public Employee(String name, String post, double dailyWage, int workDays, double grade) {
        this.name = name;
        this.post = post;
        this.dailyWage = dailyWage;
        this.workDays = workDays;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getDailyWage() {
        return dailyWage;
    }

    public void setDailyWage(double dailyWage) {
        this.dailyWage = dailyWage;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
    //打印工资printSal()
    public void printSal(){
        System.out.println("姓名："+name+" 职位："+post+" 工资："+(dailyWage*workDays*grade));
    }
}


//子类：经理
class Manager extends Employee{
    private double bonus;//奖金

    public Manager(String name, String post, double dailyWage, int workDays, double grade,double bonus) {
        super(name, post, dailyWage, workDays, grade);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printSal() {
        System.out.println("姓名："+getName()+" 职位："+getPost()+" 工资："+(bonus+getDailyWage()*getWorkDays()*getGrade()));
    }
}


//子类：普通员工
class  Worker extends Employee{

    public Worker(String name, String post, double dailyWage, int workDays, double grade) {
        super(name, post, dailyWage, workDays, grade);
    }

    @Override
    public void printSal() {
        super.printSal();
    }
}
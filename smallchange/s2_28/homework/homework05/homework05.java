package com.smallchange.s2_28.homework.homework05;

/*
设计父类-员工类。子类：工人(Worker),农民(Peasant),教师(Teacher),科学家(Scientist),服务生(Waiter)
		1其中工人，农民，服务生只有基本工资
		2教师除基本工资外，还有课酬(元/天)
		3科学家除基本工资外，还有年终奖
		4编写一个测试类，将各种类型的员工的全年工资打印出来
 */

public class homework05 {

    public static void main(String[] args) {
        Worker worker = new Worker("张三", "工人", 100, 365);
        Peasant peasant = new Peasant("李四", "农民", 110, 365);
        Teacher teacher = new Teacher("王五", "教师", 200, 365, 100);
        Scientist scientist = new Scientist("真六", "科学家", 300, 365, 10000000);
        worker.annualSalary();
        peasant.annualSalary();
        teacher.annualSalary();
        scientist.annualSalary();
    }
}

class Employee {
    private String name;
    private String post;//职位
    private double dailyWage;//单日工资
    private int workDays;//工作天数

    public Employee(String name, String post, double dailyWage, int workDays) {
        this.name = name;
        this.post = post;
        this.dailyWage = dailyWage;
        this.workDays = workDays;
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

    public void annualSalary(){
        System.out.println("姓名："+name+"职位："+post+" 工资："+(dailyWage*workDays));
    }
}

//子类：工人
class Worker extends Employee{

    public Worker(String name, String post, double dailyWage, int workDays) {
        super(name, post, dailyWage, workDays);
    }

    @Override
    public void annualSalary() {
        super.annualSalary();
    }
}

//子类：农民
class Peasant extends  Employee{

    public Peasant(String name, String post, double dailyWage, int workDays) {
        super(name, post, dailyWage, workDays);
    }

    @Override
    public void annualSalary() {
        super.annualSalary();
    }
}

//子类：服务生
class Waiter extends Employee{

    public Waiter(String name, String post, double dailyWage, int workDays) {
        super(name, post, dailyWage, workDays);
    }

    @Override
    public void annualSalary() {
        super.annualSalary();
    }
}

//子类：教师
class Teacher extends Employee{
    private double classPay;

    public Teacher(String name, String post, double dailyWage, int workDays,double classPay) {
        super(name, post, dailyWage, workDays);
        this.classPay = classPay;
    }

    public double getClassPay() {
        return classPay;
    }

    public void setClassPay(double classPay) {
        this.classPay = classPay;
    }

    @Override
    public void annualSalary() {
        System.out.println("姓名："+getName()+"职位："+getPost()+" 工资："+(getDailyWage()*getWorkDays()+classPay*getWorkDays()));
    }
}

//子类：科学家
class Scientist extends  Employee{
    private double bonus;

    public Scientist(String name, String post, double dailyWage, int workDays,double bonus) {
        super(name, post, dailyWage, workDays);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void annualSalary() {
        System.out.println("姓名："+getName()+"职位："+getPost()+" 工资："+(getDailyWage()*getWorkDays()+bonus));
    }
}


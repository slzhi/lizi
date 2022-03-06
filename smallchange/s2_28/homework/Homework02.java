package com.smallchange.s2_28.homework;

/*
* 1要求有属性"姓名name"，"年龄age"，"职称post","基本工资salary"
		2编写业务方法，introduce(),实现输出一个教师的信息
		3编写教师类的三个子类：教授类(Professor)、副教授类、讲师类。工资级别分别为：
		    教授1.3、副教授为1.2、讲师类1.1.在三个子类里面重写父类introduce()方法
		4定义并初始化一个老师对象，调用业务方法，实现对象基本信息的后台打印。
*/
public class Homework02 {

    public static void main(String[] args) {
        Professor professor = new Professor("张三", 30, "高级", 10000);
        AssociateProfessor associateProfessor = new AssociateProfessor("李四", 26, "中级", 8000);
        Lecturer lecturer = new Lecturer("王五", 23, "初级", 6000);
        professor.introduce();
        associateProfessor.introduce();
        lecturer.introduce();
    }
}

class Teacher {

    private String name;
    private int age;
    private String post;//职称
    private double salary;//薪水

    public Teacher(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void introduce() {
        System.out.println("名字：" + name + " 年龄：" + age + " 职务：" + post + " 薪水:" + salary);
    }
}

class Professor extends Teacher{

    public Professor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public void introduce() {
        System.out.println("这是教授的信息");
        super.introduce();
    }
}

class AssociateProfessor extends Teacher{

    public AssociateProfessor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public void introduce() {
        System.out.println("这是副教授的信息");
        super.introduce();
    }
}

class Lecturer extends Teacher{

    public Lecturer(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public void introduce() {
        System.out.println("这是讲师的信息");
        super.introduce();
    }
}
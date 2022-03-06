package com.smallchange.s3_1.homework.homework13;
/*
案例题目描述：
    1做一个Student类，Student类有名称(name),性别(sex),年龄(age),学号(stu_id),做合理封装，通过构造器在创建对象时将4个属性赋值
    2写一个Teacher类，Teacher类有名称(name),性别(sex),年龄(age),工龄(work_age)，做合理封装，通过构造器在创建对象时将4个属性赋值
    3抽取一个父类Person类，将共同属性和方法放到Person类
    4学生需要有学习的方法(study),在方法里写"我承诺，我会好好学习"
    5教师需要有教学的方法(teach),在方法里写"我承诺，我会认真教学";
    6学生和教师都要玩的方法(play),学生玩的是足球，老师玩的是象棋，此方法是返回字符串的，分别返回"xx爱玩足球"和"xx爱玩象棋"。
        因为玩的方法名称都一样，所以要求此方法定义在父类中，子类实现重写
    7定义多态数组，里面保存两个学生和两个教室，要求按照年龄从高到低排序
    8定义方法，形参为Person类型，功能：调用学生的study或教师的teach方法
 */
public class Homework13 {

    public static void main(String[] args) {
        Person[] people = new Person[4];
        people[0] = new Student("张三",14,'男',1);
        people[1] = new Student("李四",16,'男',2);
        people[2] = new Teacher("王五",30,'男',10);
        people[3] = new Teacher("真六",40,'男',6);

        Homework13 homework13 = new Homework13();
        homework13.sort(people);

        for(int i=0;i< people.length;i++){
            System.out.println(people[i].printInfo());
            System.out.println("----------------");
        }



    }
    public void test(Person p){
        if(p instanceof Student){//p的运行类型是Student
            ((Student)p).study();
        }else if(p instanceof Teacher){
            ((Teacher)p).teach();
        }else {
            System.out.println("do not");
        }
    }

    Person temp = null;
    public void sort(Person[] people){
        for(int i=0;i<people.length;i++){
            for (int j=0;j< people.length-1-i;j++){
                if(people[j].getAge()<people[j+1].getAge()) {
                    temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                }
            }
        }
    }
}

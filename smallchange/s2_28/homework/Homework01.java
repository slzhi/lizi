package com.smallchange.s2_28.homework;

//定义一个Person类{name,age,job},初始化Person对象数组，有三个person对象，按照age从大到小排序，使用冒泡排序
public class Homework01 {

    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("hei", 20, "初级工程师");
        people[1] = new Person("baide", 30, "中级工程师");
        people[2] = new Person("hang", 40, "高级工程师");
        //输出数组
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);//默认对象的.toString()
        }
        System.out.println("");
        //冒泡
        Person tmp = null;//用于交换
        for (int i = 0; i < people.length - 1; i++) {
            for (int j = 0; j < people.length - 1 - i; j++) {
                //并按照age从小到大进行排序，如果前面人的age<后面人的年龄，就交换
               /* if(people[i].getAge()>people[i+1].getAge()){
                    tmp = people[i];
                    people[i] = people[i + 1];
                    people[i + 1] = tmp;
                }*/
                //按照name长度从小到大进行排序
                if(people[i].getName().length()>people[i+1].getName().length()){
                    tmp = people[i];
                    people[i] = people[i + 1];
                    people[i + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);//默认对象的.toString()
        }
    }
}

class Person {

    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}

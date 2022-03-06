package com.object.o2_23;

public class Encapsulation {

    public static void main(String[] args) {
      /*  Person person = new Person();
        person.setName("xiaohei");
        person.setAge(20);
        person.setSalary(10000);
        System.out.println(person.info());
*/
        Person xiaobai = new Person("xiaobai", 2000, 60000);
        System.out.println(xiaobai.info());
    }
}
/*
不能随便查看人的年龄，工资等隐私，并对设置的年龄进行合理的验证。
年龄合理就设置，否则给默认。年龄必须在1~120，年龄、工资不能直接查看，name的长度在2~6字符直接。
 */

class Person {

    public String name;//名字：公开
    private int age;//年龄：私有化
    private int salary;//薪水：私有化

//    有三个属性的构造器
    public Person(String name, int age, int salary) {
      /*  this.name = name;
        this.age = age;
        this.salary = salary;*/
        //我们可以把set方法卸载构造器中，这样仍然可以验证数据
        setName(name);
        setAge(age);
        setSalary(salary);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //加入对数据的检测
        if(name.length()>=2 && name.length()<=6){
            this.name = name;
        }else {
            System.out.println("名字过长：需要(2~6个字符)请重新输入");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //判断
        if(age>=1 && age<=120){//如果是合理范围
            this.age = age;
        }else{
            System.out.println("年龄需要在1~120岁");
            this.age = 18;//给一个默认年龄
        }

    }

    public int getSalary() {
        //可以这里增加对当前对象的权限判断
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    //写一个方法，返回属性信息
    public String info() {
        return "信息为 name=" + name + " age=" + age + " 薪水=" + salary;
    }
}
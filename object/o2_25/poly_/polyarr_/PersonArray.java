package com.object.o2_25.poly_.polyarr_;

public class PersonArray {

    public static void main(String[] args) {
        //现有一个继承结构如下：要求创建一个Person对象
        //1个student对象1个teacher对象，统一放在数组中，并调用每个对象say方法
        Person[] people = new Person[3];
        people[0] = new Person("jack", 20);
        people[1] = new Student("jack", 18, 90);
        people[2] = new Teacher("king", 30, 2500);
        //遍历多态数组，调用say
        for (int i = 0; i < people.length; i++) {
            //people[i]编译类型是Person,运行类型是根据实际情况由JVM来判断
            System.out.println(people[i].say());//动态绑定机制
            //使用 类型判断+向下转型
            if (people[i] instanceof Student) {//判断people[i] 的运行类型是是否为Student
                Student student = (Student) people[i];//向下转型
                student.study();
            } else if (people[i] instanceof Teacher) {
                ((Teacher) people[i]).teach();//也可以这样写
            }
        }
    }
}

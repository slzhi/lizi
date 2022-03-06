package com.object.o2_25.poly_.detail;

public class PolyDetail {

    public static void main(String[] args) {
        //向上转型
        //语法：父类类型	引用名 = new 子类类型();
        Animal animal = new Cat();
        //可以调用父类中的索引成员(需遵守访问权限)
        //但是不能调用子类的特有的成员
        //因为在编译阶段，能调用哪些成员是由编译类型来决定的
        //最终运行效果看子类(运行类型)的具体实现，即调用方法时，按照从子类(运行类型)
        // 开始查找方法，然后调用。
        animal.eat();
        animal.run();
        animal.show();
        animal.sleep();

        //多态的向下转型
        //子类类型 引用名 = (子类类型) 父类引用
        Cat cat = (Cat) animal;
        cat.catchMouse();
        //要求父类的引用必须指向的是当前目标类型的对象

    }
}

package com.object.o2_25.poly_;

public class Poly {

    public static void main(String[] args) {
        Master xm = new Master("小明");
        Dog dog = new Dog("小黑");
        Bone bone = new Bone("骨头");
        xm.feed(dog, bone);

        Cat cat = new Cat("小白猫");
        Fish fish = new Fish("鲫鱼");
        xm.feed(cat,fish);

    }
}

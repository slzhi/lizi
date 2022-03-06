package com.object.o2_25.poly_.detail;

public class PolyDetail02 {

    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb instanceof AA);

        //aa编译类型AA 运行类型BB
        AA aa = new BB();
        System.out.println(aa instanceof  AA);
        System.out.println(aa instanceof BB);

    }
}

class AA{}

class BB extends AA{}
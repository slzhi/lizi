package com.chapter10.final3_8;

public class Final01 {

    public static void main(String[] args) {
        E e = new E();
      //  e.tax = 9;
    }
}

/*
如果要求A类不能被其他类继承，可以使用final修饰 A类
final class A {}
class B extends A{}
*/

/*
如果要求hi不能被子类重写，可以使用final修饰 hi()
class C {
    public final void hi() {}
}
class D extends C {
    @Override
    public void hi() {super.hi();}
}
*/

//当不希望类的某个属性的值不被修改，可以使用final修饰
class E {

    public final double TEX_RATE = 0.08;
}


//当不希望某个局部变量被修改,可以使用final修饰
class F{
    public void cay(){
        final double TEX_RATE=0.1;
       // TEX_RATE = 0.9;
        System.out.println(TEX_RATE);
    }
}
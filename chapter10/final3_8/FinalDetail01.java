package com.chapter10.final3_8;

public class FinalDetail01 {

    public static void main(String[] args) {
       // new EE().cal();
        System.out.println(BBB.num);
        //包装类(Integer,Double,Float,Boolean等都是final)，String也是final类
    }
}

//一般来说，如果一个类已经final类了，就没有必要在方法修饰成final方法
final class AAA{
    public final void cry(){}
}

//final和static往往搭配使用，效率更高，不会导致类加载。底层编译器做了优化处理
class BBB{
    public final static int num = 1000;
    static {
        System.out.println("BBB 静态代码块被执行");
    }
}

class AA{
    /*
        1 定义时：如public final double tex = 0.1;
        2 在构造器中
        3 在代码块中
     */
    public final double TAX_RATE = 0.1;
    public final double TAX_RATE1;
    public final double TAX_RATE2;

    public AA() {//构造器赋值
        TAX_RATE1 = 1.1;
    }
    {//代码块赋值
        TAX_RATE2 =2.2;
    }
}

class BB{
    /*
        如果final修饰的属性是静态的，则初始化的位置只能是
		    1定义时		2静态代码块，不能再构造器中赋值
     */
    public static final double TEX_RATE = 0.1;
    public final double TAX_RATE1 = 0.1;
    //public static final double TAX_RATE1;
    public static final double TAX_RATE2;
 /*
    public BB(){
        TAX_RATE1 = 2.2;
    }
  */
    static {
        TAX_RATE2 = 3.3;
    }
}
//final类不能被继承，但可以实例化对象
final class CC{ }
//如果类不是final类，但是含有final方法，则该方法虽然不能重写，但是可以被继承
class DD{
    public final void cal(){
        System.out.println("cat()");
    }
}
class EE extends DD{

}
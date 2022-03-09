package com.chapter10.interface3_8.interfaceDetail_;

public class interfaceDetail02 {
    public static void main(String[] args) {
        //证明：接口中的属性，是public static final
        System.out.println(IB.n1);//说明n1就是static
        //IB.n1=30;//说明n1是final
    }
}


interface IB{
    //接口中的属性，只能是final的，而且是public static final 修饰符。
    int n1 = 10;//public static fianl int a=1;
    void hi();
}
interface IC{
    void say();
}
/*
    5 一个类同时可以实现多个接口
    6 接口中的属性，只能是final的，而且是public static final 修饰符。比如：
		int a=1;实际上是public static fianl int a=1;(必须初始化)
	7 接口中属性的访问形式：接口名.属性名
	8 一个接口不能继承其它的类，但是可以继承多个别的接口
		interface A extends B,C{}
	9 接口的修饰符 只能是public和默认，这点和类的修饰符是一样的
 */
class Pig implements IB,IC{
    @Override
    public void hi() { }
    @Override
    public void say() { }
}
//一个接口不能继承其它的类，但是可以继承多个别的接口
interface ID extends IB,IC{

}
package com.chapter10.codeblock3_7;

public class CodeBlock01 {

    public static void main(String[] args) {
        Movie movie = new Movie("长津湖");
        Movie movie1 = new Movie("杀手不太冷", 200, "小白");

    }

}

class Movie{
    private String name;//名字
    private double price;//价格
    private String director;//导演

    /*
        3个构造器→重载
        1 下面三个构造器都有相同的语句
        2 这样代码看起来比较啰嗦
        3 这是我们可以把相同的语句，放入到一个代码块中
        4 这样当我们不管调用哪个构造器，创建对象，都会先调用代码块的内容
     */
    {
        System.out.println("电影屏幕打开");
        System.out.println("广告开始。。");
        System.out.println("电影正式开始");
    }
    public Movie(String name, double price, String director) {
        this.name = name;
        this.price = price;
        this.director = director;
        System.out.println(name+price+director);
    }

    public Movie(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Movie(String name) {
        this.name = name;
        System.out.println(name);
    }
}

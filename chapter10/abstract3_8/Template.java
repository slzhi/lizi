package com.chapter10.abstract3_8;

public abstract class Template {
    public abstract void code();//抽象方法
    public void calcTime(){//实现方法，调用code
        //开始时间
        long start = System.currentTimeMillis();
        code();
        //结束时间
        long end = System.currentTimeMillis();
        System.out.println("AA执行时间" + (end - start));
    }


}


class Sub extends Template{

    @Override
    public void code() {
        long num = 0;
        for (long i = 1; i <= 1000000; i++) {
            num += i;
        }
    }
}
package com.chapter10.abstract3_8;
//要求：1有多个类，完成不同的任务job	2要求能够得到各自完成任务的实践
public class TestTemplate {

    public static void main(String[] args) {
        AA aa = new AA();
        aa.calculateTime();
        new BB().calculateTime();
    }
}

class AA {

    public void calculateTime(){
        //开始时间
        long start = System.currentTimeMillis();
        job();
        //结束时间
        long end = System.currentTimeMillis();
        System.out.println("AA执行时间" + (end - start));
    }

    public void job() {
        long num = 0;
        for (long i = 1; i <= 100000; i++) {
            num += i;
        }
    }

}

class BB {
    public void calculateTime(){
        //开始时间
        long start = System.currentTimeMillis();
        job();
        //结束时间
        long end = System.currentTimeMillis();
        System.out.println("AA执行时间" + (end - start));
    }

    public void job() {
        long num = 0;
        for (long i = 1; i <= 100000; i++) {
            num *= i;
        }
    }
}
package com.object.o2_25.poly_.polyparameter;

public class Worker extends Employee {

    public Worker(String name, double salary) {
        super(name, salary);
    }

    public void work() {
        System.out.println("员工" + getName() + "(正在工作)");
    }

    //重写获取年薪方法
    @Override
    public double getAnnual() {//因为普通员工没有其他收入，直接调用父类就可以了
        return super.getAnnual();
    }
}

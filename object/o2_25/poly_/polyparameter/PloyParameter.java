package com.object.o2_25.poly_.polyparameter;

public class PloyParameter {

    public static void main(String[] args) {
        Worker tom = new Worker("tom", 2000);
        Manager mi = new Manager("mi", 4000,100000);
        PloyParameter ployParameter = new PloyParameter();
        ployParameter.showEmpAnnual(tom);
        ployParameter.testWork(tom);
        ployParameter.showEmpAnnual(mi);
        ployParameter.testWork(mi);

    }
    //实现获取任何员工对象的年工资，并在Main方法中调用该方法e.getAnnual()
    public void showEmpAnnual(Employee e){
        System.out.println(e.getAnnual());//动态绑定机制
    }
    //添加一个方法，testWork,如果是普通员工，则调用work方法，如果是经理，则调用manger方法
    public void testWork(Employee e){
        if(e instanceof Worker){
            ((Worker) e).work();
        }else if(e instanceof  Manager){
            ((Manager) e).manage();//向下转型
        }else{
            System.out.println( " ");
        }
    }
}

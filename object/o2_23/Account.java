package com.object.o2_23;

/*
创建程序，在其中定义两个类：Account和AccountTest类体会java的封装性
		1.Account类要求具有属性：姓名(长度为2位3位或4位)、余额(必须>20)、密码(必须是6位)，如果不满足，则给出提示信息，并给默认值
		2.通过setXxx的方法给Account的属性赋值。
		3.在AccountTest中测试
 */
public class Account {

    private String name;//姓名
    private double balance;//余额
    private String password;//密码

    public Account(String name, double balance, String password) {

        setName(name);
        setBalance(balance);
        setPassword(password);
    }

    public String getName() {
        return name;
    }

    //姓名(长度为2位3位或4位)
    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("姓名(长度为2位3位或4位),默认无名");
            this.name = "无名";
        }
    }

    public double getBalance() {
        return balance;
    }

    //余额(必须>20)
    public void setBalance(double balance) {
        if (balance > 20) {
            this.balance = balance;
        } else {
            System.out.println("余额(必须>20) 默认为0");
        }
    }

    public String getPassword() {
        return password;
    }

    //密码(必须是6位)
    public void setPassword(String password) {
        if (password.length() == 6) {
            this.password = password;
        } else {
            System.out.println("密码(必须是6位) 默认密码为000000");
            this.password = "000000";
        }
    }

    //显示信息
    public void showInfo() {
        System.out.println("信息为 name=" + name + " 余额=" + balance + " 密码=" + password);
    }
}

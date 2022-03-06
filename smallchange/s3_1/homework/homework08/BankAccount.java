package com.smallchange.s3_1.homework.homework08;

public class BankAccount {//父类
    private int balance;//余额
    public BankAccount(int initialBalance){
        this.balance = initialBalance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    //存款
    public void deposit(double amount){
        balance += amount;
    }
    //取款
    public void withdraw(double amount){
        balance -= amount;
    }

}

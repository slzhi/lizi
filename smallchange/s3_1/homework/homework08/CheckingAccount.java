package com.smallchange.s3_1.homework.homework08;

public class CheckingAccount extends  BankAccount{//子类

    public CheckingAccount(int initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {//存款
        super.deposit(amount-1);
    }

    @Override
    public void withdraw(double amount) {//取款
        super.withdraw(amount+1);
    }
}

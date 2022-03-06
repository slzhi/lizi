package com.smallchange.s3_1.homework.homework08;

public class homework08 {

    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(100);
        checkingAccount.deposit(100);
        checkingAccount.withdraw(8);
        System.out.println(checkingAccount.getBalance());

    }
}

package com.smallchange.s3_2.SmallChangeOOP;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
    该类完成零钱通的各个功能类
    使用OOP面向对象编程
    将各个功能一一实现
 */
public class SmallChangeOOP {

    //属性
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key = "";
    String details = "-----零钱通明细----";
    double money = 0;//输入的钱
    double balance = 0;//余额
    Date date = null;//date是java.util.Date类型，表示日期
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//用来日期格式化的
    String note = "";

    //完成显示菜单，并可以选择
    public void mainMenu() {
        do {
            System.out.println("\n=====零钱通菜单(OOP)=====");
            System.out.println("\t 1 零钱通明细");
            System.out.println("\t 2 收益入账");
            System.out.println("\t 3 消费");
            System.out.println("\t 4 退    出");
            System.out.println("请选择1~4");

            key = scanner.next();
            switch (key) {
                case "1":
                    this.detail();
                    break;

                case "2":
                    this.income();
                    break;

                case "3":
                    this.pay();
                    break;

                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("选择错误，请在1~4直接选择");
            }
        } while (loop);
    }

    //完成零钱通明细
    public void detail() {
        System.out.println(details);
    }

    //完成收益入账
    public void income() {
        System.out.print("收益入账金额：");
        money = scanner.nextDouble();
        //money 的值范围应该效验
        //找出不正确的金额条件，然后给出提示，就直接return
        if (money <= 0) {
            System.out.println("收益入账金额 需要 大于 0");
            return;//退出方法，不再执行后面代码
        }
        //找出正确金额的条件
        balance += money;
        //拼接收益入账信息到details
        date = new Date();//获取当前日期
        details += "\n收益入账:\t" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    //消费
    public void pay() {
        System.out.println("3 消费");
        money = scanner.nextDouble();
        //money的值范围应该效验
        //找出金额不正确的情况
        if (money <= 0) {
            System.out.println("消费金额应该在0-" + balance);
            return;
        }
        System.out.println("消费说明：");
        note = scanner.next();
        balance -= money;

        //拼接消费信息到details
        date = new Date();//获取当前日期
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    //退出
    public void exit() {
        String choice = "";
        while (true) {
            System.out.println("你确定要退出吗？y/n");
            choice = scanner.next();
            if ("y".equals(choice) || "n".equals(choice)) {
                break;
            }
        }
        //当用户退出while时进行判断
        if (choice.equals("y")) {
            System.out.println("4 退    出");
            loop = false;
        }
    }
}

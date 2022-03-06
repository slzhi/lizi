package com.smallchange.s2_28.SmallChange;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChange {

    /*化繁为简
        1、先完成显示菜单，选择菜单，返回对应提示
        2、完成零钱通明细
        3、完成收益入账  完成功能驱动程序员增加新的变化和代码
        4、消费
        5、退出
        6、用户输入4退出，提示你确定要退订吗y/n必须输入y/n，否则循环输入指令，直到输入y/n
        7、在收益和消费时，判断金额是否合理，并给出相应的提示
     */
    public static void main(String[] args) {
        //1.先完成显示菜单，选择菜单，返回对应提示
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";

        //2、完成零钱通明细
        //     1.可以把收益入账和消费，保存数组2.使用对象3.也可以使用String拼接

        String details = "-----零钱通明细----";
        //3、完成收益入账  完成功能驱动程序员增加新的变化和代码
        //     定义新的变量   保存输入金额和余额
        double money = 0;//输入的钱
        double balance = 0;//余额
        Date date = null;//date是java.util.Date类型，表示日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//用来日期格式化的

        //4、消费
        //    定义新变量，保存消费的原因
        String note = "";

        do {
            System.out.println("\n=====零钱通=====");
            System.out.println("\t 1 零钱通明细");
            System.out.println("\t 2 收益入账");
            System.out.println("\t 3 消费");
            System.out.println("\t 4 退    出");
            System.out.println("请选择1~4");

            key = scanner.next();
            switch (key) {
                case "1":
                    System.out.println(details);
                    break;

                case "2":
                    System.out.print("收益入账金额：");
                    money = scanner.nextDouble();
                    //money 的值范围应该效验
                    //找出不正确的金额条件，然后给出提示，就直接break
                    if (money <= 0) {
                        System.out.println("收益入账金额 需要 大于 0");
                        break;
                    }
                    //找出正确金额的条件
                    balance += money;
                    //拼接收益入账信息到details
                    date = new Date();//获取当前日期
                    details += "\n收益入账:\t" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;

                case "3":
                    System.out.println("3 消费");
                    money = scanner.nextDouble();
                    //money的值范围应该效验
                    //找出金额不正确的情况
                    if (money <= 0) {
                        System.out.println("消费金额应该在0-" + balance);
                        break;

                    }
                    System.out.println("消费说明：");
                    note = scanner.next();
                    balance -= money;

                    //拼接消费信息到details
                    date = new Date();//获取当前日期
                    details += "\n收益入账:\t" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;

                case "4":
                    /*用户输入4退出，提示你确定要退订吗y/n必须输入y/n
                        否则循环输入指令，直到输入y/n
                        1定义一个变量 choice,接受用户的输入
                        2使用while+break，来处理接收输入的y/n
                        3退出while，判断choice是y/n，决定是否退出
                        4建议一段代码，完成一个小功能，尽量不要写在一起
                    */
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
                    break;
                default:
                    System.out.println("选择错误，请在1~4直接选择");
            }
        } while (loop);
        System.out.println("====退出零钱通====");
    }
}

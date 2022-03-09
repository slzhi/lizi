package com.chapter10.interface3_8.usbInterface_;

public class Interface01 {

    public static void main(String[] args) {
        //Camera 实现了 UsbInterface
        Camera camera = new Camera();
        //Phone 实现了 UsbInterface
        Phone phone = new Phone();
        //创建计算机
        Computer computer = new Computer();
        computer.work(camera);//相机接入计算机
        computer.work(phone);//手机接入计算机
    }
}

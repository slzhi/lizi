package com.chapter10.interface3_8.usbInterface_;

public interface UsbInterface {//接口
    //规定接口的相关方法
    public void start();
    public void stop();
}

/*
    Phone类实现UsbInterface
    Phone类需要实现UsbInterface接口 规定/声明的方法
 */
class Phone implements UsbInterface{
    @Override
    public void start() {
        System.out.println("手机开始工作");
    }
    @Override
    public void stop() {
        System.out.println("手机停止工作");
    }
}

class Camera implements UsbInterface {
    @Override
    public void start() {
        System.out.println("相机开始工作");
    }
    @Override
    public void stop() {
        System.out.println("相机开始工作");
    }
}
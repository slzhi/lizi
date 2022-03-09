package com.chapter10.interface3_8.usbInterface_;

public class Computer {
    //编写一个方法
    /*
        1.UsbInterface usbInterface 形参是接口类型 UsbInterface
        2.看到接受实现了 UsbInterface接口的类的对象实例
     */
    public void work(UsbInterface usbInterface){
        usbInterface.start();
        usbInterface.stop();
    }
}

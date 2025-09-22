package com.scaler.concurrency;

public class Client {
    public static void main(String[] args) {

        System.out.println("Hello, World!"+Thread.currentThread().getName()); //main thread will execute this

        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        Thread thread1 = new Thread(helloWorldPrinter);
        thread1.start();

        System.out.println("Hello, World!"+Thread.currentThread().getName()); //main thread will execute this
    }
}

package com.scaler.concurrency.syncronizedMethod;

public class Client {
    public static void main(String[] args) throws InterruptedException {

        Count count = new Count();

        Adder adder = new Adder(count);
        Subtracter subtracter = new Subtracter(count);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtracter);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final value of shared variable: " + count.getSharedValue());
    }
}

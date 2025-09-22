package com.scaler.concurrency.concurrencyPrintNum1to100;

public class PrintNumberFrom1To100 implements Runnable{

    private int number;

    public PrintNumberFrom1To100(int number) {
        this.number = number;
    }

    @Override
    public void run() {
     System.out.println(number + " Printed by " + Thread.currentThread().getName());
    }
}

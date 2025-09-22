package com.scaler.concurrency.concurrencyPrintNum1to100;

public class Client {
    public static void main(String[] args) {
        for(int i=1; i<=100; i++) {
            Thread thread = new Thread(new PrintNumberFrom1To100(i));
            thread.start();
        }
    }
}

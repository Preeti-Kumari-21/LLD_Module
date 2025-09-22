package com.scaler.concurrency.executors;

public class CreateExecutorClass implements Runnable {

    private Integer number;

    public CreateExecutorClass(Integer number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println(number + " Printed by " + Thread.currentThread().getName());
    }
}

package com.scaler.concurrency.ProducerConsumerProblem;

import java.util.Objects;
import java.util.Queue;

public class Consumer implements Runnable{

    private Queue<Object> store;
    private String name;
    private int maxSize;

    public Consumer(Queue<Object> store, String name, int maxSize) {
        this.store = store;
        this.name = name;
        this.maxSize = maxSize;
    }

    @Override
    public void run() {

        while (true){
            if(store.size() > 0){
                System.out.println("Consumer " + name + " consumed an item. Store size: " + (store.size()));
                store.remove();
            }
        }

    }
}

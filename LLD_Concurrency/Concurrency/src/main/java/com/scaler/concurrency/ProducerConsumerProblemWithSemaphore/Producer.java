package com.scaler.concurrency.ProducerConsumerProblemWithSemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable{

    private Queue<Object> store;
    private String name;
    private int maxSize;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;

    public Producer(Queue<Object> store, String name , int maxSize,
                    Semaphore producerSemaphore,
                    Semaphore consumerSemaphore) {
        this.store = store;
        this.name = name;
        this.maxSize = maxSize;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }

    @Override
    public void run() {

        while(true){
            try {
                producerSemaphore.acquire(); //Only if the store is empty we can produce ie producer--
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Producer " + name + " produced an item. Store size: " + (store.size()));
            store.add(new Object()); // shirt is added to the store
            consumerSemaphore.release(); //notify the consumer that a shirt is added consumer++
        }
    }
}

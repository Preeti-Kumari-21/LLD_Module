package com.scaler.concurrency.ProducerConsumerProblemWithSemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{

    private Queue<Object> store;
    private String name;
    private int maxSize;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;

    public Consumer(Queue<Object> store, String name, int maxSize,
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
                consumerSemaphore.acquire(); //consumer will consume only if there is something to consume ie consumer--
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Consumer " + name + " consumed an item. Store size: " + (store.size()));
            store.remove(); // shirt is removed from the store
            producerSemaphore.release();  //notify the producer that a shirt is removed producer++ now please produce shirts for the empty slots
        }
    }
}

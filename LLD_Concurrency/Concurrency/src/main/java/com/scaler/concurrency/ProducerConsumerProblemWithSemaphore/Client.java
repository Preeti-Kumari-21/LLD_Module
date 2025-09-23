package com.scaler.concurrency.ProducerConsumerProblemWithSemaphore;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {

        Queue<Object> store = new ConcurrentLinkedQueue<>(); //take any queue implementation
        int maxSize = 200;

        Semaphore producerSemaphore = new Semaphore(maxSize);
        Semaphore consumerSemaphore = new Semaphore(0);

        Producer producer1 = new Producer(store, "Producer1", maxSize, producerSemaphore, consumerSemaphore);
        Producer producer2 = new Producer(store, "Producer2", maxSize, producerSemaphore, consumerSemaphore);
        Producer producer3 = new Producer(store, "Producer3", maxSize, producerSemaphore, consumerSemaphore);
        Producer producer4 = new Producer(store, "Producer4", maxSize, producerSemaphore, consumerSemaphore);
        Producer producer5 = new Producer(store, "Producer5", maxSize, producerSemaphore, consumerSemaphore);

        Consumer consumer1 = new Consumer(store, "Consumer1", maxSize, producerSemaphore, consumerSemaphore);
        Consumer consumer2 = new Consumer(store, "Consumer2", maxSize, producerSemaphore, consumerSemaphore);
        Consumer consumer3 = new Consumer(store, "Consumer3", maxSize, producerSemaphore, consumerSemaphore);



        Thread producerThread1 = new Thread(producer1);
        Thread producerThread2 = new Thread(producer2);
        Thread producerThread3 = new Thread(producer3);
        Thread producerThread4 = new Thread(producer4);
        Thread producerThread5 = new Thread(producer5);
        Thread consumerThread1 = new Thread(consumer1);
        Thread consumerThread2 = new Thread(consumer2);
        Thread consumerThread3 = new Thread(consumer3);
        producerThread1.start();
        producerThread2.start();
        producerThread3.start();
        producerThread4.start();
        producerThread5.start();
        consumerThread1.start();
        consumerThread2.start();
        consumerThread3.start();



    }
}

package com.scaler.concurrency.ProducerConsumerProblemWithMutex;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Client {
    public static void main(String[] args) {

        Queue<Object> store = new ConcurrentLinkedQueue<>(); //take any queue implementation
        int maxSize = 6;

        Producer producer1 = new Producer(store, "Producer1", maxSize);
        Producer producer2 = new Producer(store, "Producer2", maxSize);
        Producer producer3 = new Producer(store, "Producer3", maxSize);
        Producer producer4 = new Producer(store, "Producer4", maxSize);
        Producer producer5 = new Producer(store, "Producer5", maxSize);

        Consumer consumer1 = new Consumer(store, "Consumer1", maxSize);
        Consumer consumer2 = new Consumer(store, "Consumer2", maxSize);
        Consumer consumer3 = new Consumer(store, "Consumer3", maxSize);

       /* ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(producer1);
        executorService.submit(producer2);
        executorService.submit(producer3);
        executorService.submit(producer4);
        executorService.submit(producer5);

        executorService.submit(consumer1);
        executorService.submit(consumer2);
        executorService.submit(consumer3);

        executorService.shutdown();*/

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

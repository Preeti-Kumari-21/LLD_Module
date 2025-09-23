package com.scaler.concurrency.ProducerConsumerProblem;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {

        Queue<Object> store = new ArrayDeque<>(); //take any queue implementation
        int maxSize = 6;

        Producer producer1 = new Producer(store, "Producer1", maxSize);
        Producer producer2 = new Producer(store, "Producer2", maxSize);
        Producer producer3 = new Producer(store, "Producer3", maxSize);
        Producer producer4 = new Producer(store, "Producer4", maxSize);
        Producer producer5 = new Producer(store, "Producer5", maxSize);

        Consumer consumer1 = new Consumer(store, "Consumer1", maxSize);
        Consumer consumer2 = new Consumer(store, "Consumer2", maxSize);
        Consumer consumer3 = new Consumer(store, "Consumer3", maxSize);

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(producer1);
        executorService.submit(producer2);
        executorService.submit(producer3);
        executorService.submit(producer4);
        executorService.submit(producer5);

        executorService.submit(consumer1);
        executorService.submit(consumer2);
        executorService.submit(consumer3);

        executorService.shutdown();


    }
}

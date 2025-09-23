package com.scaler.concurrency.callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client{
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(38);
        list.add(27);
        list.add(43);
        list.add(3);
        list.add(9);
        list.add(82);
        list.add(10);

        ExecutorService executorService = Executors.newCachedThreadPool();
        MergeSortUsingCallable mergeSort = new MergeSortUsingCallable(list,executorService);
        Future<List<Integer>> finalMergedSortedList = executorService.submit(mergeSort);
        try {
            System.out.println(finalMergedSortedList.get());
        } catch (Exception e) {
            e.printStackTrace();
    }
        executorService.shutdown();
    }
}

package com.scaler.concurrency.callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static java.io.ObjectInputFilter.merge;

public class MergeSortUsingCallable implements Callable<List<Integer>> {

    private List<Integer> listToSort;
    private ExecutorService executorService;

    public MergeSortUsingCallable(List<Integer> listToSort, ExecutorService executorService) {
        this.listToSort = listToSort;
        this.executorService = executorService;
    }

    @Override
    public List<Integer> call() throws Exception {

        int n = listToSort.size();
        if (n <= 1) {
        return listToSort;
    }

        List<Integer> leftHalfOfList = new ArrayList<>();
        List<Integer> rightHalfOfList = new ArrayList<>();

        for (int i = 0; i < n / 2; i++) {
            leftHalfOfList.add(listToSort.get(i));
        }
        for (int i = n / 2; i < n; i++) {
            rightHalfOfList.add(listToSort.get(i));
        }

        //Sort left half and right half recursively by two different threads
        MergeSortUsingCallable leftSorter = new MergeSortUsingCallable(leftHalfOfList, executorService);
        MergeSortUsingCallable rightSorter = new MergeSortUsingCallable(rightHalfOfList, executorService);

        //create the threads using executor service and submit the tasks
       // ExecutorService executorService = Executors.newCachedThreadPool();
        Future<List<Integer>> sortedLeftHalf = executorService.submit(leftSorter);
        Future<List<Integer>> sortedRightHalf = executorService.submit(rightSorter);

        //get the sorted halves
        List<Integer> sortedLeftList = sortedLeftHalf.get();
        List<Integer> sortedRightList = sortedRightHalf.get();

        //merge the two sorted halves
        int i = 0, j = 0;
        List<Integer> mergedList = new ArrayList<>();
        while (i < sortedLeftList.size() && j < sortedRightList.size()) {
            if (sortedLeftList.get(i) <= sortedRightList.get(j)) {
                mergedList.add(sortedLeftList.get(i));
                i++;
            } else {
                mergedList.add(sortedRightList.get(j));
                j++;
            }
        }

            while (i < sortedLeftList.size()) {
                mergedList.add(sortedLeftList.get(i));
                i++;
            }

            while (j < sortedRightList.size()) {
                mergedList.add(sortedRightList.get(j));
                j++;
            }

            return  mergedList;
}
}
